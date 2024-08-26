package com.project.nanuriserver.domain.auth.service

import com.project.nanuriserver.domain.auth.client.request.RefreshTokenRequest
import com.project.nanuriserver.domain.auth.client.request.SignInRequest
import com.project.nanuriserver.domain.auth.client.request.SignUpRequest
import com.project.nanuriserver.domain.auth.service.response.JsonWebTokenResponse
import com.project.nanuriserver.domain.auth.service.response.RefreshTokenResponse
import com.project.nanuriserver.domain.user.domain.entity.UserEntity
import com.project.nanuriserver.domain.user.domain.enum.UserRole
import com.project.nanuriserver.domain.user.domain.repository.jpa.UserJpaRepository
import com.project.nanuriserver.domain.user.client.dto.User
import com.project.nanuriserver.domain.user.exception.PasswordWrongException
import com.project.nanuriserver.domain.user.exception.UserExistException
import com.project.nanuriserver.domain.user.exception.UserNotFoundException
import com.project.nanuriserver.global.security.jwt.JwtExtract
import com.project.nanuriserver.global.security.jwt.JwtProvider
import com.project.nanuriserver.global.security.jwt.exception.TokenExpiredException
import com.project.nanuriserver.global.security.jwt.exception.error.JwtErrorType
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class AuthService(
    private val userJpaRepository: UserJpaRepository,
    private val encoder: PasswordEncoder,
    private val jwtProvider: JwtProvider,
    private val jwtExtract: JwtExtract,
) {

    fun signUp(request: SignUpRequest) {
        if (userJpaRepository.existsByPhoneNumber(request.phoneNumber)) {
            throw UserExistException
        }
        save(request)
    }

    fun signIn(request: SignInRequest): JsonWebTokenResponse {
        val user: User = userJpaRepository.findByPhoneNumber(request.phoneNumber)
            .map { userEntity -> User.toUser(userEntity) }
            ?.orElseThrow { UserNotFoundException }
            ?: throw UserNotFoundException
        val password: String = user.password
        if (!encoder.matches(request.password, password))
            throw PasswordWrongException
        return JsonWebTokenResponse(
            accessToken = jwtProvider.generateAccessToken(request.phoneNumber, user.userRole),
            refreshToken = jwtProvider.generateRefreshToken(request.phoneNumber, user.userRole),
            userRole = user.userRole
        )
    }

    fun refresh(request: RefreshTokenRequest): RefreshTokenResponse {
        val got = jwtExtract.getToken(request.refreshToken)
        val user = jwtExtract.findUserByEmail(got)
        if (jwtExtract.checkTokenInfo(got) == JwtErrorType.ExpiredJwtException) {
            throw TokenExpiredException.EXCEPTION
        }
        return RefreshTokenResponse(jwtProvider.generateAccessToken(user.phoneNumber, user.userRole))
    }

    fun save(request: SignUpRequest) {
        userJpaRepository.save(
            UserEntity(
                phoneNumber = request.phoneNumber,
                name = request.name,
                password = encoder.encode(request.password),
                latitude = request.latitude,
                longitude = request.longitude,
                userRole = UserRole.USER
            )
        )
    }

}
