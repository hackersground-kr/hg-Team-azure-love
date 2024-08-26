package com.project.nanuriserver.domain.room.domain.repository.jpql

import com.project.nanuriserver.domain.room.domain.entity.RoomEntity
import com.project.nanuriserver.domain.room.dto.Room
import com.project.nanuriserver.domain.user.domain.entity.UserEntity
import com.project.nanuriserver.global.jdsl.JdslExecutorSupport
import java.util.*

class RoomJpqlRepositoryImpl(
    private val jdslExecutorSupport: JdslExecutorSupport
) : RoomJpqlRepository {
    override fun findAllRoomWhereUserParticipating(userId: UUID): List<Room> {
        return jdslExecutorSupport.findAllNotNull {
            selectNew<Room>(path(RoomEntity::id), path(UserEntity::_uuid), path(UserEntity::name))
//            select(entity(RoomEntity::class))
                .from(
                    entity(RoomEntity::class),
                    innerJoin(UserEntity::class).on(
                        path(UserEntity::_uuid).ne(userId).and(path(UserEntity::_uuid).`in`(path(RoomEntity::userFirst), path(RoomEntity::userSecond)))
                    )
                )
                .where(or(path(RoomEntity::userFirst).eq(userId), path(RoomEntity::userSecond).eq(userId)))
        }
//            .map { Room(it.id, it.userFirst, "${it.userSecond}") }
    }
}
