package com.project.nanuriserver.domain.user.exception.error

import com.project.nanuriserver.global.exception.error.ErrorProperty
import org.springframework.http.HttpStatus

enum class UserError(override val status: HttpStatus, override val message: String) : ErrorProperty {

    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "유저를 찾을 수 없습니다."),
    PASSWORD_WRONG(HttpStatus.BAD_REQUEST, "비밀번호가 맞지 않습니다."),
    USER_EXIST(HttpStatus.CONFLICT, "이미 존재하는 유저입니다.");

    override val code: String
        get() = name
}
