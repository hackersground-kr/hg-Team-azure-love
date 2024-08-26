package com.project.nanuriserver.domain.user.exception

import com.project.nanuriserver.domain.user.exception.error.UserError
import com.project.nanuriserver.global.exception.BusinessException

object UserExistException : BusinessException(UserError.USER_EXIST) {

    private fun readResolve(): Any = UserExistException

}