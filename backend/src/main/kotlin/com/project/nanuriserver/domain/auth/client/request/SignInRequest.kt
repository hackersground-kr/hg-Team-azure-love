package com.project.nanuriserver.domain.auth.client.request

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Pattern

data class SignInRequest(
    @JsonProperty("phoneNumber")
    @field:Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 약식과 맞지 않습니다.")
    val phoneNumber: String,
    @JsonProperty("password")
    val password: @NotBlank String
)
