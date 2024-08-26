package com.project.nanuriserver.global.common.dto.response

import com.project.nanuriserver.global.exception.error.ErrorProperty
import org.springframework.http.ResponseEntity

class ErrorResponse(val code: String, val status: Int, val detail: String) {
        companion object {
            fun create(message: ErrorProperty, vararg args: Any?) = ErrorResponse(message.code, message.status.value(), message.message.format(*args))
            fun of(message: ErrorProperty, vararg args: Any?) =
                ResponseEntity
                    .status(message.status)
                    .body(create(message, *args))
        }
    }
