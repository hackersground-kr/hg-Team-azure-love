package com.project.nanuriserver.domain.post.domain.enum

import com.project.nanuriserver.domain.post.exception.InvalidStatusException

enum class Status {

    PROGRESS, DONE;

    companion object {
        fun StatusSafe(status: String) = try {
            valueOf(status)
        } catch (e: IllegalArgumentException) {
            throw InvalidStatusException
        }
    }
}
