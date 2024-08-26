package com.project.nanuriserver.domain.image.entity

import com.project.nanuriserver.global.common.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "tb_image")
class ImageEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val imageUuid: UUID? = null,

    @Column(nullable = false)
    val imageUrl: String

): BaseEntity()
