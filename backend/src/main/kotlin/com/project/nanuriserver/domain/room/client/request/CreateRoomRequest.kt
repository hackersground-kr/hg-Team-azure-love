package com.project.nanuriserver.domain.room.client.request

import com.fasterxml.jackson.annotation.JsonCreator
import com.project.nanuriserver.global.common.util.ValidateUUID

data class CreateRoomRequest @JsonCreator constructor(
    @field:ValidateUUID
    val uuid: String
)
