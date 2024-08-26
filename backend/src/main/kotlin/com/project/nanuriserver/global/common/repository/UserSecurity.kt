package com.project.nanuriserver.global.common.repository

import com.project.nanuriserver.domain.user.client.dto.User

interface UserSecurity {

    fun getUser(): User

}