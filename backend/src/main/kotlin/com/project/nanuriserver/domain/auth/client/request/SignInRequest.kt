package com.project.nanuriserver.domain.auth.client.request

import com.fasterxml.jackson.annotation.JsonProperty

data class SignInRequest(
    @JsonProperty("phoneNumber")
    val phoneNumber: String,
    @JsonProperty("password")
    val password: String
)