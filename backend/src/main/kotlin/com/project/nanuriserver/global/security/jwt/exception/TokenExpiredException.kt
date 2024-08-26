package com.project.nanuriserver.global.security.jwt.exception

import com.project.nanuriserver.global.exception.BusinessException
import com.project.nanuriserver.global.security.jwt.exception.error.JwtTokenError

object TokenExpiredException : BusinessException(JwtTokenError.JWT_EXPIRED) {

    private fun readResolve(): Any = TokenExpiredException

    val EXCEPTION: TokenExpiredException = TokenExpiredException

}