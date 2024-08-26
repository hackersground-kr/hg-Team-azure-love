package com.project.nanuriserver.domain.auth.client.api

import com.project.nanuriserver.domain.auth.client.request.RefreshTokenRequest
import com.project.nanuriserver.global.common.dto.response.BaseResponse
import com.project.nanuriserver.global.common.dto.response.BaseResponseData
import com.project.nanuriserver.domain.auth.client.request.SignInRequest
import com.project.nanuriserver.domain.auth.client.request.SignUpRequest
import com.project.nanuriserver.domain.auth.service.AuthService
import com.project.nanuriserver.domain.auth.service.response.JsonWebTokenResponse
import com.project.nanuriserver.domain.auth.service.response.RefreshTokenResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
@Tag(name = "인증 API")
class AuthController (private val authService: AuthService) {

    @PostMapping("/sign-up")
    @Operation(summary = "회원가입")
    @ResponseStatus(HttpStatus.CREATED)
    fun signUp(@RequestBody @Valid request: SignUpRequest): BaseResponse {
        authService.signUp(request)
        return BaseResponse.created("회원가입 성공")
    }

    @PostMapping("/sign-in")
    @Operation(summary = "로그인")
    fun signIn(@RequestBody @Valid request: SignInRequest): BaseResponseData<JsonWebTokenResponse> {
        return BaseResponseData.ok(
            message = "로그인 성공",
            data = authService.signIn(request))
    }

    @PostMapping("/refresh")
    @Operation(summary = "토큰 재발급")
    fun refresh(@RequestBody request: RefreshTokenRequest): BaseResponseData<RefreshTokenResponse> {
        return BaseResponseData.ok(
            message = "토큰 재발급 성공",
            data = authService.refresh(request))
    }

}
