package com.project.nanuriserver.domain.post.exception

import com.project.nanuriserver.domain.post.exception.error.PostError
import com.project.nanuriserver.global.exception.BusinessException

object InvalidCategoryException : BusinessException(PostError.INVALID_CATEGORY) {
    private fun readResolve(): Any = InvalidCategoryException
}
