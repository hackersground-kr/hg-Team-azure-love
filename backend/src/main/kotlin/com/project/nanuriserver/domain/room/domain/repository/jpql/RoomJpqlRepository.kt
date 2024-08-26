package com.project.nanuriserver.domain.room.domain.repository.jpql

import com.project.nanuriserver.domain.room.dto.Room
import java.util.*

interface RoomJpqlRepository {
    fun findAllRoomWhereUserParticipating(userId: UUID): List<Room>
}
