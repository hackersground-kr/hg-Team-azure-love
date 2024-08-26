package com.project.nanuriserver.domain.post.domain.repository.jpql

import com.linecorp.kotlinjdsl.querymodel.jpql.predicate.Predicate
import com.linecorp.kotlinjdsl.support.spring.data.jpa.repository.KotlinJdslJpqlExecutor
import com.project.nanuriserver.domain.post.client.dto.Post
import com.project.nanuriserver.domain.post.domain.entity.PostEntity
import com.project.nanuriserver.domain.post.domain.enum.Category
import com.project.nanuriserver.domain.post.domain.enum.Status
import com.project.nanuriserver.domain.user.domain.entity.UserEntity
import com.project.nanuriserver.global.jdsl.CustomJpql
import com.project.nanuriserver.global.jdsl.JdslExecutorSupport
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.support.PageableExecutionUtils
import java.util.*

class PostJpqlRepositoryImpl(
    private val jdslHelper: JdslExecutorSupport,
    private val kotlinJdslJpqlExecutor: KotlinJdslJpqlExecutor,
) : PostJpqlRepository {
    override fun findAllByUserId(page: Pageable, id: UUID): Page<Post> {
        return pagedQuery(page) {
            path(PostEntity::author).eq(id)
        }
    }

    override fun findAllPostByPagination(page: Pageable): Page<Post> {
        return pagedQuery(page)
    }

    override fun findAllPostByStatus(page: Pageable, status: Status): Page<Post> {
        return pagedQuery(page) {
            path(PostEntity::status).eq(status)
        }
    }

    override fun findAllPostByCategory(page: Pageable, category: Category): Page<Post> {
        return pagedQuery(page) {
            path(PostEntity::category).eq(category)
        }
    }

    override fun searchPosts(page: Pageable, term: String): Page<Post> {
        return pagedQuery(page) {
            lower(path(PostEntity::title)).like("%$term%")
        }
    }

    private fun pagedQuery(page: Pageable, predicate: (CustomJpql.() -> Predicate)? = null): Page<Post> {
        val lim = jdslHelper.findLimited(page.offset.toInt(), page.pageSize) {
            selectNew<Post>(
                path(PostEntity::id),
                path(PostEntity::title),
                path(PostEntity::content),
                path(UserEntity::_uuid),
                path(UserEntity::name),
                path(PostEntity::imageUrl),
                path(PostEntity::category),
                path(PostEntity::status),
            )
                .from(
                    entity(PostEntity::class),
                    join(entity(UserEntity::class))
                        .on(path(UserEntity::_uuid).eq(path(PostEntity::author)))
                )
                .apply {
                    predicate?.let { where(it()) }
                }
                .orderBy(path(PostEntity::createdDateTime).desc())
        }

        return PageableExecutionUtils.getPage(lim, page) {
            jdslHelper.getOrNull {
                select(count(PostEntity::_id))
                    .from(entity(PostEntity::class))
                    .apply {
                        predicate?.let { where(it()) }
                    }
                    .orderBy(path(PostEntity::createdDateTime).desc())
            }!!
        }
    }

    override fun modify(id: Long, title: String?, content: String?, imageUrl: String?, status: Status?) {
        if (title == null && content == null && imageUrl == null && status == null)
            return // no modify. why??
        kotlinJdslJpqlExecutor.update(CustomJpql) {
            update(entity(PostEntity::class))
                .run {
                    var p = title?.let { set(path(PostEntity::title), it) }
                    content?.let {
                        val pth = path(PostEntity::content)
                        p?.set(pth, it) ?: run { p = set(pth, it) }
                    }
                    imageUrl?.let {
                        val pth = path(PostEntity::imageUrl)
                        p?.set(pth, it) ?: run { p = set(pth, it) }
                    }
                    status?.let {
                        val pth = path(PostEntity::status)
                        p?.set(pth, it) ?: run { p = set(pth, it) }
                    }
                    p!!
                }
                .where(path(PostEntity::_id).eq(id))
        }
    }
}
