package com.project.nanuriserver.global.common.util

import com.project.nanuriserver.global.exception.error.BadRequestException
import java.util.UUID

fun UUIDSafe(uuidOrNot: String): UUID = try {
    UUID.fromString(uuidOrNot)
} catch (e: IllegalArgumentException) {
    throw BadRequestException
}
