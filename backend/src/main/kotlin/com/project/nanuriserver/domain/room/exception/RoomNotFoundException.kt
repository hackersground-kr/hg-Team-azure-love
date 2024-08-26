package com.project.nanuriserver.domain.room.exception

import com.project.nanuriserver.global.exception.BusinessException

object RoomNotFoundException : BusinessException(RoomError.ROOM_NOT_FOUND) {
    private fun readResolve(): Any = RoomNotFoundException
}
