package com.project.nanuriserver.domain.user.exception

import com.project.nanuriserver.domain.user.exception.error.UserError
import com.project.nanuriserver.global.exception.BusinessException

object PasswordWrongException : BusinessException(UserError.PASSWORD_WRONG) {

    private fun readResolve(): Any = PasswordWrongException

}