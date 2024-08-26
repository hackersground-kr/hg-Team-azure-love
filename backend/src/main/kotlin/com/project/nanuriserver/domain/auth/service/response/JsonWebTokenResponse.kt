package com.project.nanuriserver.domain.auth.service.response

import com.fasterxml.jackson.annotation.JsonInclude
import com.project.nanuriserver.domain.user.domain.enum.UserRole

@JsonInclude(JsonInclude.Include.NON_EMPTY)
class JsonWebTokenResponse(
    val accessToken: String,
    val refreshToken: String,
    val userRole: UserRole
)
