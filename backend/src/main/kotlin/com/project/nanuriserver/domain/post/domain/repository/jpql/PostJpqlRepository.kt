package com.project.nanuriserver.domain.post.domain.repository.jpql

import com.project.nanuriserver.domain.post.client.dto.Post
import com.project.nanuriserver.domain.post.domain.enum.Category
import com.project.nanuriserver.domain.post.domain.enum.Status
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.util.UUID

interface PostJpqlRepository {
    fun findAllByUserId(page: Pageable, id: UUID): Page<Post>
    fun findAllPostByPagination(page: Pageable): Page<Post>
    fun findAllPostByStatus(page: Pageable, status: Status): Page<Post>
    fun findAllPostByCategory(page: Pageable, category: Category): Page<Post>
    fun searchPosts(page: Pageable, term: String): Page<Post>
    fun modify(id: Long, title: String?, content: String?, imageUrl: String?, status: Status?)
}
