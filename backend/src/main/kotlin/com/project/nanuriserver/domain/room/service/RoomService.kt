package com.project.nanuriserver.domain.room.service

import com.project.nanuriserver.domain.room.domain.entity.RoomEntity
import com.project.nanuriserver.domain.room.domain.repository.RoomRepository
import com.project.nanuriserver.domain.room.dto.Room
import com.project.nanuriserver.domain.user.domain.repository.jpa.UserJpaRepository
import com.project.nanuriserver.domain.user.exception.UserNotFoundException
import com.project.nanuriserver.global.common.repository.UserSecurity
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@Transactional(readOnly = true, rollbackFor = [Exception::class])
class RoomService(
    private val roomRepository: RoomRepository,
    private val userRepository: UserJpaRepository,
    private val loginUser: UserSecurity,
) {
    @Transactional(rollbackFor = [Exception::class])
    fun createRoom(userId: UUID): UUID {
        if (!userRepository.existsById(userId))
            throw UserNotFoundException

        val ent = roomRepository.save(
            RoomEntity(
                userFirst = loginUser.getUser().uuid,
                userSecond = userId,
            )
        )

        return ent.id
    }

    fun getRooms(): List<Room> {
        val userId = loginUser.getUser().uuid
        return roomRepository.findAllRoomWhereUserParticipating(userId)
    }
}
