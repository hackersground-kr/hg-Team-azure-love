package com.project.nanuriserver.global.exception.error

import com.project.nanuriserver.global.exception.BusinessException

object AccessDeniedException : BusinessException(ErrorCode.ACCESS_DENIED) {
    private fun readResolve(): Any = AccessDeniedException
}
