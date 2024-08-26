package com.project.nanuriserver.domain.post.domain.repository

import com.project.nanuriserver.domain.post.domain.repository.jpa.PostJpaRepository
import com.project.nanuriserver.domain.post.domain.repository.jpql.PostJpqlRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : PostJpaRepository, PostJpqlRepository
