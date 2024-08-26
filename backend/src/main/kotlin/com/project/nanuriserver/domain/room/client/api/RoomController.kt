package com.project.nanuriserver.domain.room.client.api

import com.project.nanuriserver.domain.room.client.request.CreateRoomRequest
import com.project.nanuriserver.domain.room.dto.Room
import com.project.nanuriserver.domain.room.service.RoomService
import com.project.nanuriserver.global.common.dto.response.BaseResponseData
import com.project.nanuriserver.global.common.util.UUIDSafe
import io.swagger.v3.oas.annotations.Operation
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
@RequestMapping("/room")
class RoomController(
    private val roomService: RoomService
) {
    @PostMapping
    @Operation(summary = "채팅방 생성")
    @ResponseStatus(HttpStatus.CREATED)
    fun createRoom(@RequestBody @Valid request: CreateRoomRequest): BaseResponseData<UUID> {
        val userId = UUIDSafe(request.uuid)
        val createdUuid = roomService.createRoom(userId)
        return BaseResponseData.of(HttpStatus.CREATED, "방이 생성 되었습니다.", createdUuid)
    }

    @GetMapping
    @Operation(summary = "채팅방 리스트")
    fun rooms(): BaseResponseData<List<Room>> {
        val rooms = roomService.getRooms()
        return BaseResponseData.ok(rooms, "조회 완료")
    }
}
