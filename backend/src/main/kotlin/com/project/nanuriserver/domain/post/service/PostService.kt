package com.project.nanuriserver.domain.post.service

import com.project.nanuriserver.domain.post.client.dto.Post
import com.project.nanuriserver.domain.post.client.dto.request.PostRegisterRequest
import com.project.nanuriserver.domain.post.domain.entity.PostEntity
import com.project.nanuriserver.domain.post.domain.enum.Category
import com.project.nanuriserver.domain.post.domain.enum.Status
import com.project.nanuriserver.domain.post.domain.repository.PostRepository
import com.project.nanuriserver.domain.post.exception.PostNotFoundException
import com.project.nanuriserver.global.common.repository.UserSecurity
import com.project.nanuriserver.global.exception.error.AccessDeniedException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository,
    private val userSecurity: UserSecurity,
) {

    fun registerPost(request: PostRegisterRequest) {
        postRepository.save(
            PostEntity(
                title = request.title,
                content = request.content,
                author = userSecurity.getUser().uuid,
                imageUrl = request.imageUrl,
                status = Status.PROGRESS,
                category = request.category,
            )
        )
    }

    fun findMyPost(page: Pageable): Page<Post> {
        return postRepository.findAllByUserId(page, userSecurity.getUser().uuid)
    }

    fun search(pageable: Pageable, term: String): Page<Post> {
        return postRepository.searchPosts(pageable, term)
    }

    fun modify(id: Long, title: String?, content: String?, imageUrl: String?, status: String?) {
        val statusSafe = status?.let { Status.StatusSafe(it) }
        val found = postRepository.findByIdOrNull(id)
            ?: throw PostNotFoundException

        if (found.author != userSecurity.getUser().uuid)
            throw AccessDeniedException

        postRepository.modify(found.id, title, content, imageUrl, statusSafe)
    }

    fun findAll(pageable: Pageable): Page<Post> {
        return postRepository.findAllPostByPagination(pageable)
    }

    fun findByCategory(pageable: Pageable, category: String): Page<Post> {
        return postRepository.findAllPostByCategory(pageable, Category.CategorySafe(category))
    }

    fun findByStatus(pageable: Pageable, status: String): Page<Post> {
        return postRepository.findAllPostByStatus(pageable, Status.StatusSafe(status))
    }
}
