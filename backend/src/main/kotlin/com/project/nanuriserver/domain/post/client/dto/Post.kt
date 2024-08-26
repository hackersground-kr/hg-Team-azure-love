package com.project.nanuriserver.domain.post.client.dto

import com.project.nanuriserver.domain.post.domain.enum.Category
import com.project.nanuriserver.domain.post.domain.enum.Status
import java.util.*

data class Post(
    val id: Long,
    val title: String,
    val content: String,
    val authorId: UUID,
    val authorName: String,
    val imageUrl: String?,
    val category: Category,
    val status: Status
)
