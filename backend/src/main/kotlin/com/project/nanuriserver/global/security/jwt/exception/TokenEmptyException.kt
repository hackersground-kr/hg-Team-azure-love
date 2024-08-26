package com.project.nanuriserver.global.security.jwt.exception

import com.project.nanuriserver.global.exception.BusinessException
import com.project.nanuriserver.global.security.jwt.exception.error.JwtTokenError

object TokenEmptyException: BusinessException(JwtTokenError.JWT_EMPTY_EXCEPTION) {
    private fun readResolve():Any = TokenEmptyException
    val EXCEPTION: TokenEmptyException = TokenEmptyException
}