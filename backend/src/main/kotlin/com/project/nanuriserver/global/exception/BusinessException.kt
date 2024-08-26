package com.project.nanuriserver.global.exception

import com.project.nanuriserver.global.exception.error.ErrorProperty

open class BusinessException(val error: ErrorProperty) : RuntimeException() {

}