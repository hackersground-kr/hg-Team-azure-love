package com.project.nanuriserver.global.security.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.project.nanuriserver.global.common.dto.response.ErrorResponse
import com.project.nanuriserver.global.exception.error.ErrorCode
import com.project.nanuriserver.global.exception.error.ErrorProperty
import com.project.nanuriserver.global.security.jwt.JwtExtract
import com.project.nanuriserver.global.security.jwt.exception.error.JwtTokenError
import com.project.nanuriserver.global.security.jwt.filter.CoroutineSecurityFilter
import com.project.nanuriserver.global.security.jwt.filter.JwtAuthenticationFilter
import jakarta.servlet.http.HttpServletResponse
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.context.SecurityContextHolder.MODE_INHERITABLETHREADLOCAL
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import java.io.IOException


@Configuration
@EnableWebSecurity
class SecurityConfig(
    private val objectMapper: ObjectMapper,
    private val jwtExtract: JwtExtract,
    private val coroutineSecurityFilter: CoroutineSecurityFilter
) {
    @Bean
    fun securityFilterChain(
        http: HttpSecurity
    ): SecurityFilterChain {

        SecurityContextHolder.setStrategyName(MODE_INHERITABLETHREADLOCAL)

        return http
            .csrf { it.disable() }
            .cors { corsConfigurationSource() }
            .formLogin { it.disable() }
            .securityContext { it.requireExplicitSave(true) }
            .sessionManagement { session ->
                session.sessionCreationPolicy(
                    SessionCreationPolicy.STATELESS
                )
            }
            .exceptionHandling {
                it.accessDeniedHandler { _, response, _ ->
                    response.send(ErrorCode.ACCESS_DENIED)
                }
                    .authenticationEntryPoint { req, res, _ ->
                        res.send(
                            if (req.getHeader("Authorization") != null) JwtTokenError.JWT_ERROR
                            else JwtTokenError.JWT_EMPTY_EXCEPTION
                        )
                    }
            }
            .authorizeHttpRequests {
                it
                    .requestMatchers("/swagger-ui/**", "/v3/**").permitAll()
                    .requestMatchers("/auth/**").permitAll()
                    .requestMatchers("/check/generate").permitAll()
                    .anyRequest().authenticated()
            }
            .addFilterBefore(
                JwtAuthenticationFilter(objectMapper, jwtExtract),
                UsernamePasswordAuthenticationFilter::class.java
            )
            .addFilterBefore(coroutineSecurityFilter, UsernamePasswordAuthenticationFilter::class.java)
            .build()
    }

    private fun HttpServletResponse.send(code: ErrorProperty) {
        val entity = ErrorResponse.create(code)
        try {
            status = entity.status
            contentType = MediaType.APPLICATION_JSON_VALUE
            characterEncoding = "UTF-8"
            writer.write(objectMapper.writeValueAsString(entity))
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    @Bean
    fun corsConfigurationSource(): CorsConfigurationSource {
        val corsConfiguration = CorsConfiguration()
        corsConfiguration.addAllowedOriginPattern("*")
        corsConfiguration.addAllowedHeader("*")
        corsConfiguration.addAllowedMethod("*")
        corsConfiguration.allowCredentials = true

        val urlBasedCorsConfigurationSource = UrlBasedCorsConfigurationSource()
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration)

        return urlBasedCorsConfigurationSource
    }

    @Bean
    fun bCryptPasswordEncoder(): BCryptPasswordEncoder {
        return BCryptPasswordEncoder()
    }

}
