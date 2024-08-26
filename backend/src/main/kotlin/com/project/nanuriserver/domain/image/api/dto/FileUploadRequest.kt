package com.project.nanuriserver.domain.image.api.dto

import com.fasterxml.jackson.annotation.JsonCreator
import jakarta.validation.constraints.NotNull

data class FileUploadRequest @JsonCreator constructor(
    val file: @NotNull String, // base64
    val name: @NotNull String,
)