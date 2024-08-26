package com.project.nanuriserver.domain.room.exception

import com.project.nanuriserver.global.exception.error.ErrorProperty
import org.springframework.http.HttpStatus

enum class RoomError(override val status: HttpStatus, override val message: String) : ErrorProperty {
    ROOM_NOT_FOUND(HttpStatus.NOT_FOUND, "채팅방을 찾을 수 없습니다."),
    ;

    override val code: String
        get() = name
}
