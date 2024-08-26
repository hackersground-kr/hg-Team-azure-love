package com.project.nanuriserver.domain.user.service

import com.project.nanuriserver.domain.user.client.dto.User
import com.project.nanuriserver.global.common.repository.UserSecurity
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userSecurity: UserSecurity
) {

    fun getUser(): User {
        return userSecurity.getUser()
    }
}
