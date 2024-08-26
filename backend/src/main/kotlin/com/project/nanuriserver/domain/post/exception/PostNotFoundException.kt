package com.project.nanuriserver.domain.post.exception

import com.project.nanuriserver.domain.post.exception.error.PostError
import com.project.nanuriserver.global.exception.BusinessException

object PostNotFoundException: BusinessException(PostError.POST_NOT_FOUND) {
    private fun readResolve(): Any = PostNotFoundException
}