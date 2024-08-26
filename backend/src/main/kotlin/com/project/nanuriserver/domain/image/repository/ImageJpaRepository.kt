package com.project.nanuriserver.domain.image.repository

import com.project.nanuriserver.domain.image.entity.ImageEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ImageJpaRepository: JpaRepository<ImageEntity, String> {
}
