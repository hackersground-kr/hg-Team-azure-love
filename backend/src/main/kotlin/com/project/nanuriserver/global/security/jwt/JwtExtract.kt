package com.project.nanuriserver.global.security.jwt

import com.project.nanuriserver.domain.user.domain.repository.jpa.UserJpaRepository
import com.project.nanuriserver.domain.user.exception.UserNotFoundException
import com.project.nanuriserver.global.security.jwt.config.JwtProperties
import com.project.nanuriserver.global.security.jwt.exception.error.JwtErrorType
import com.project.nanuriserver.domain.user.client.dto.User
import com.project.nanuriserver.global.security.auth.CustomUserDetails
import io.jsonwebtoken.ExpiredJwtException
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.MalformedJwtException
import io.jsonwebtoken.UnsupportedJwtException
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Component
import java.util.*
import javax.crypto.SecretKey
import javax.crypto.spec.SecretKeySpec

@Component
class JwtExtract(
    private val jwtProvider: JwtProvider,
    private val userJpaRepository: UserJpaRepository
) {

    fun checkTokenInfo(token: String): JwtErrorType {
        try {
            Jwts.parser().verifyWith(jwtProvider.secretKey).build().parseSignedClaims(token)
            return JwtErrorType.OK
        } catch (e: ExpiredJwtException) {
            return JwtErrorType.ExpiredJwtException
        } catch (e: java.security.SignatureException) {
            return JwtErrorType.SignatureException
        } catch (e: MalformedJwtException) {
            return JwtErrorType.MalformedJwtException
        } catch (e: UnsupportedJwtException) {
            return JwtErrorType.UnsupportedJwtException
        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
            return JwtErrorType.IllegalArgumentException
        } catch (e: Exception) {
            e.printStackTrace()
            return JwtErrorType.UNKNOWN_EXCEPTION
        }
    }

    fun getAuthentication(token: String): Authentication {
        val t = getToken(token)
        val user = findUserByEmail(getUsername(t))

        val details = CustomUserDetails(user)

        return UsernamePasswordAuthenticationToken(details, null, details.authorities)
    }

    fun getToken(token: String): String {
        return token.removePrefix("Bearer ")
    }

    fun getUsername(token: String): String {
        return Jwts.parser().verifyWith(jwtProvider.secretKey).build().parseSignedClaims(token).payload.get(
            "phoneNumber",
            String::class.java
        )
    }

    fun findUserByEmail(phoneNumber: String): User {
        val optionalUserEntity = userJpaRepository.findByPhoneNumber(phoneNumber)
        return optionalUserEntity.map { userEntity -> User.toUser(userEntity) }?.orElseThrow { UserNotFoundException }
            ?: throw UserNotFoundException
    }

}
