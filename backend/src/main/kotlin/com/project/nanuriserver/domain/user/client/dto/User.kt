package com.project.nanuriserver.domain.user.client.dto

import com.project.nanuriserver.domain.user.domain.entity.UserEntity
import com.project.nanuriserver.domain.user.domain.enum.UserRole
import java.util.*

data class User(

    val uuid: UUID,
    val phoneNumber: String,
    val name: String,
    val password: String,
    var latitude: Double,
    var longitude: Double,
    val userRole: UserRole

) {

    companion object {
        fun toUser(userEntity: UserEntity): User {
            return User(
                uuid = userEntity.uuid,
                phoneNumber = userEntity.phoneNumber,
                name = userEntity.name,
                password = userEntity.password,
                latitude = userEntity.latitude,
                longitude = userEntity.longitude,
                userRole = userEntity.userRole
            )
        }
    }
}
