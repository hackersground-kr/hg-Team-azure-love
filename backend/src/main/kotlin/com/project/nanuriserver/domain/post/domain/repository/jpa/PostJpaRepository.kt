package com.project.nanuriserver.domain.post.domain.repository.jpa

import com.project.nanuriserver.domain.post.domain.entity.PostEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PostJpaRepository: JpaRepository<PostEntity, Long>
