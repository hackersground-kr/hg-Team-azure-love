package com.project.nanuriserver.domain.user.exception

import com.project.nanuriserver.domain.user.exception.error.UserError
import com.project.nanuriserver.global.exception.BusinessException

object UserNotFoundException : BusinessException(UserError.USER_NOT_FOUND) {

    private fun readResolve(): Any = UserNotFoundException

}