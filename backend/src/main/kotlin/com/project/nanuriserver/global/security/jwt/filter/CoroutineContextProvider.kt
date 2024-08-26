package com.project.nanuriserver.global.security.jwt.filter

import kotlinx.coroutines.Dispatchers
import org.springframework.stereotype.Component
import kotlin.coroutines.CoroutineContext

@Component
class CoroutineContextProvider {
    val ioContext: CoroutineContext
        get() = Dispatchers.IO
}