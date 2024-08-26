package com.project.nanuriserver.global.common.repository

import com.project.nanuriserver.domain.user.client.dto.User
import com.project.nanuriserver.global.security.auth.CustomUserDetails
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Repository

@Repository
class UserSecurityImpl : UserSecurity {

    override fun getUser(): User {
        val user: User = (SecurityContextHolder
            .getContext()
            .authentication
            .principal as CustomUserDetails).getUser()
        return user
    }

}