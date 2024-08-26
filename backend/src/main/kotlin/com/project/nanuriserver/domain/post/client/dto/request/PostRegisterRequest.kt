package com.project.nanuriserver.domain.post.client.dto.request

import com.fasterxml.jackson.annotation.JsonProperty
import com.project.nanuriserver.domain.post.domain.enum.Category

data class PostRegisterRequest(
    @JsonProperty("title")
    val title: String,
    @JsonProperty("content")
    val content: String,
    @JsonProperty("imageUuid")
    val imageUuid: String?,
    @JsonProperty("category")
    val category: Category
)
