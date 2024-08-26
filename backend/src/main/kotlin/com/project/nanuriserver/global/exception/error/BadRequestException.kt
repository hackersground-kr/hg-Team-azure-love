package com.project.nanuriserver.global.exception.error

import com.project.nanuriserver.global.exception.BusinessException

object BadRequestException : BusinessException(ErrorCode.BAD_REQUEST) {
    private fun readResolve(): Any = BadRequestException
}
