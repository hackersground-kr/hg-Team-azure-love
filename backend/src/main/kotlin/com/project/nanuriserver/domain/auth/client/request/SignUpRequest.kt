package com.project.nanuriserver.domain.auth.client.request

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Pattern

data class SignUpRequest(
    @JsonProperty("phoneNumber")
    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 약식과 맞지 않습니다.")
    val phoneNumber: String,
    @JsonProperty("name")
    val name: String,
    @JsonProperty("password")
    val password: String,
    @JsonProperty("latitude")
    var latitude: Double,
    @JsonProperty("longitude")
    var longitude: Double
)