package com.project.nanuriserver.global.exception.handler

import com.project.nanuriserver.global.common.dto.response.ErrorResponse
import com.project.nanuriserver.global.exception.BusinessException
import com.project.nanuriserver.global.exception.error.ErrorCode
import com.project.nanuriserver.global.exception.error.HandleableErrorCode
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.validation.FieldError
import org.springframework.web.HttpMediaTypeNotSupportedException
import org.springframework.web.HttpRequestMethodNotSupportedException
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.MissingServletRequestParameterException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.NoHandlerFoundException
import org.springframework.web.servlet.resource.NoResourceFoundException

@RestControllerAdvice
class ExceptionAdvice {
    private val log = LoggerFactory.getLogger(ExceptionAdvice::class.java)

    @ExceptionHandler(BusinessException::class)
    fun handleBusinessException(ex: BusinessException): ResponseEntity<ErrorResponse> {
        log.warn("Handling BusinessException", ex)
        return ErrorResponse.of(ex.error)
    }

    @ExceptionHandler(Exception::class)
    fun handleGenericException(ex: Exception): ResponseEntity<ErrorResponse> {
        log.error("Handling Generic Exception", ex)  // 디버깅용 로그 추가
        return ErrorResponse.of(ErrorCode.INTERNAL_SERVER_ERROR)
    }


    @ExceptionHandler(MissingServletRequestParameterException::class)
    fun missingParameter(e: MissingServletRequestParameterException) =
        ErrorResponse.of(HandleableErrorCode.PARAMETER_NOT_MATCH, e.parameterName, e.parameterType)

    @ExceptionHandler(NoResourceFoundException::class)
    fun noResourceFound(e: NoResourceFoundException) =
        ErrorResponse.of(HandleableErrorCode.RESOURCE_NOT_FOUND, e.resourcePath)

    @ExceptionHandler(HttpRequestMethodNotSupportedException::class)
    fun httpRequestMethodNotSupportedException(e: HttpRequestMethodNotSupportedException) =
        ErrorResponse.of(
            HandleableErrorCode.METHOD_NOT_SUPPORTED,
            e.method,
            e.supportedMethods?.joinToString("', '") ?: "N/A"
        )

    @ExceptionHandler(HttpMessageNotReadableException::class)
    fun httpMessageNotReadableException(e: HttpMessageNotReadableException) =
        ErrorResponse.of(HandleableErrorCode.UNPROCESSABLE_BODY)

    @ExceptionHandler(HttpMediaTypeNotSupportedException::class)
    fun httpMediaTypeNotSupportedException(e: HttpMediaTypeNotSupportedException) =
        ErrorResponse.of(
            HandleableErrorCode.UNSUPPORTED_MEDIA_TYPE,
            e.contentType,
            e.supportedMediaTypes.takeIf { it.isNotEmpty() }?.joinToString("', '") ?: "N/A"
        )

    @ExceptionHandler(NoHandlerFoundException::class)
    fun noHandlerFoundException(e: NoHandlerFoundException) =
        ErrorResponse.of(
            HandleableErrorCode.NO_HANDLER_FOUND,
            e.requestURL
        )

    @ExceptionHandler
    fun methodArgumentNotValidException(e: MethodArgumentNotValidException) =
        ErrorResponse.of(
            HandleableErrorCode.INVALID_PARAMETER,
            e.bindingResult.allErrors.joinToString(", ") { "in field '${(it as FieldError).field}': ${it.defaultMessage}" }
        )

//    @ExceptionHandler
//    fun badCredentialsException(e: BadCredentialsException) =
//        ErrorResponse.of(AuthExceptionDetails.BAD_CREDENTIALS)
}
