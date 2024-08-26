package com.project.nanuriserver.domain.post.client.dto.request

import com.project.nanuriserver.global.common.util.ValidateUUID

data class PostModifyRequest(
    val title: String? = null,
    val content: String? = null,
    @field:ValidateUUID
    val imageUuid: String? = null,
    val status: String? = null
)
