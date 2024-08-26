package com.project.nanuriserver.domain.room.dto

import java.util.UUID

data class Room(
    val roomId: UUID,
    val userId: UUID,
    val username: String,
)
