package com.project.nanuriserver.global.security.jwt.filter

import com.project.nanuriserver.global.exception.BusinessException
import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter

@Component
class CoroutineSecurityFilter : OncePerRequestFilter() {

    override fun doFilterInternal(request: HttpServletRequest, response: HttpServletResponse, chain: FilterChain) {
        val securityContext = SecurityContextHolder.getContext()

        // Wrap the chain execution in a coroutine context
        runBlocking {
            try {
                withContext(Dispatchers.IO + SecurityContextElement(securityContext)) {
                    chain.doFilter(request, response)
                }
            } catch (e: BusinessException) {
                // 로그 또는 다른 처리를 추가
                throw e  // 예외를 다시 던져 Spring이 처리하도록 함
            }
        }
    }
}