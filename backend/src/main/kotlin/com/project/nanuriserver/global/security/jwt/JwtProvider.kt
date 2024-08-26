package com.project.nanuriserver.global.security.jwt

import com.project.nanuriserver.domain.user.domain.enum.UserRole
import com.project.nanuriserver.global.security.jwt.config.JwtProperties
import io.jsonwebtoken.Jwts
import org.springframework.stereotype.Component
import java.nio.charset.StandardCharsets
import java.util.*
import javax.crypto.SecretKey
import javax.crypto.spec.SecretKeySpec

@Component
class JwtProvider(private val jwtProperties: JwtProperties) {

    private val secretKey: SecretKey = SecretKeySpec(
        this.jwtProperties.secretKey.toByteArray(StandardCharsets.UTF_8),
        Jwts.SIG.HS256.key().build().algorithm
    )

    fun generateAccessToken(phoneNumber: String, userRole: UserRole): String {
        return Jwts.builder()
            .claim("phoneNumber", phoneNumber)
            .claim("authority", userRole.key)
            .issuedAt(Date(System.currentTimeMillis()))
            .expiration(Date(System.currentTimeMillis() + jwtProperties.expiration))
            .signWith(secretKey)
            .compact()
    }

    fun generateRefreshToken(phoneNumber: String, userRole: UserRole): String {
        return Jwts.builder()
            .claim("phoneNumber", phoneNumber)
            .claim("authority", userRole.key)
            .issuedAt(Date(System.currentTimeMillis()))
            .expiration(Date(System.currentTimeMillis() + jwtProperties.refreshExpiration))
            .signWith(secretKey)
            .compact()
    }

}
