package com.project.nanuriserver.global.security.jwt.exception

import com.project.nanuriserver.global.exception.BusinessException
import com.project.nanuriserver.global.security.jwt.exception.error.JwtTokenError

object TokenUnKnownException: BusinessException(JwtTokenError.JWT_UNKNOWN_EXCEPTION) {
    private fun readResolve(): Any = TokenUnKnownException
    val EXCEPTION: TokenUnKnownException = TokenUnKnownException
}