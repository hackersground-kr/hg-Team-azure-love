package com.project.nanuriserver.domain.room.domain.repository

import com.project.nanuriserver.domain.room.domain.entity.RoomEntity
import com.project.nanuriserver.domain.room.domain.repository.jpql.RoomJpqlRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface RoomRepository : JpaRepository<RoomEntity, UUID>, RoomJpqlRepository
