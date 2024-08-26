package com.project.nanuriserver.domain.post.exception

import com.project.nanuriserver.domain.post.exception.error.PostError
import com.project.nanuriserver.global.exception.BusinessException

object InvalidStatusException : BusinessException(PostError.INVALID_STATUS) {
    private fun readResolve(): Any = InvalidStatusException
}
