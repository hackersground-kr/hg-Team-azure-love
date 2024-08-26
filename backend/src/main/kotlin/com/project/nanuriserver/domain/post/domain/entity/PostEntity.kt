package com.project.nanuriserver.domain.post.domain.entity

import com.project.nanuriserver.domain.post.domain.enum.Category
import com.project.nanuriserver.domain.post.domain.enum.Status
import com.project.nanuriserver.global.common.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.UUID

@Entity
class PostEntity(
    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val content: String,

    @Column(nullable = false)
    val author: UUID,

    val imageUuid: UUID? = null,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    val category: Category,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    val status: Status,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val _id: Long? = null,
): BaseEntity() {
    val id get() = _id!!
}
