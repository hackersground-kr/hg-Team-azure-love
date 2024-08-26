package com.project.nanuriserver.domain.post.exception.error

import com.project.nanuriserver.global.exception.error.ErrorProperty
import org.springframework.http.HttpStatus

enum class PostError(override val status: HttpStatus, override val message: String) : ErrorProperty {
    POST_NOT_FOUND(HttpStatus.NOT_FOUND, "게시글을 찾을 수 없습니다."),
    INVALID_CATEGORY(HttpStatus.BAD_REQUEST, "알맞지 않은 게시글 카테고리입니다."),
    INVALID_STATUS(HttpStatus.BAD_REQUEST, "알맞지 않은 게시글 상태입니다."),
    ;

    override val code: String
        get() = name
}
