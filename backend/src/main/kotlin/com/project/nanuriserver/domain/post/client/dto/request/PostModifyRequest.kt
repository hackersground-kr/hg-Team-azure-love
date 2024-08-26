package com.project.nanuriserver.domain.post.client.dto.request

data class PostModifyRequest(
    val title: String? = null,
    val content: String? = null,
    val imageUrl: String? = null,
    val status: String? = null
)
