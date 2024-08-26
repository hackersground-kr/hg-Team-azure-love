package com.project.nanuriserver.global.jdsl

import com.linecorp.kotlinjdsl.dsl.jpql.jpql
import com.linecorp.kotlinjdsl.querymodel.jpql.JpqlQueryable
import com.linecorp.kotlinjdsl.querymodel.jpql.select.SelectQuery
import com.linecorp.kotlinjdsl.render.RenderContext
import com.linecorp.kotlinjdsl.support.spring.data.jpa.extension.createQuery
import com.linecorp.kotlinjdsl.support.spring.data.jpa.repository.KotlinJdslJpqlExecutor
import jakarta.persistence.EntityManager
import org.springframework.stereotype.Component

@Component
class JdslExecutorSupport(
    private val kotlinJdslJpqlExecutor: KotlinJdslJpqlExecutor,
    private val entityManager: EntityManager,
    private val jpqlRenderContext: RenderContext,
) {
    fun <T : Any> findAllNotNull(init: CustomJpql.() -> JpqlQueryable<SelectQuery<T>>): List<T> {
        return kotlinJdslJpqlExecutor.findAll(CustomJpql, init)
            .filterNotNull()
    }

    fun <T : Any> findLimited(offset: Int, count: Int, init: CustomJpql.() -> JpqlQueryable<SelectQuery<T>>): List<T> {
        return entityManager
            .createQuery(jpql(CustomJpql, init), jpqlRenderContext)
            .apply {
                firstResult = offset
                setMaxResults(count)
            }
            .resultList
            .filterNotNull()
    }

    fun <T : Any> getOrNull(init: CustomJpql.() -> JpqlQueryable<SelectQuery<T>>): T? {
        return entityManager
            .createQuery(jpql(CustomJpql, init), jpqlRenderContext)
            .apply { setMaxResults(1) }
            .resultList
            .firstOrNull()
    }
}
