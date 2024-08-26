package com.project.nanuriserver.domain.image.api

import com.project.nanuriserver.domain.image.api.dto.FileUploadRequest
import com.project.nanuriserver.domain.image.service.ImageService
import com.project.nanuriserver.global.common.dto.response.BaseResponseData
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/image")
@Tag(name = "이미지 API")
class ImageController(
    private val imageService: ImageService
) {

    @PostMapping("")
    @Operation(summary = "이미지 업로드")
    fun uploadImage(@RequestBody @Valid request: FileUploadRequest): BaseResponseData<UUID> {
        return BaseResponseData.ok(
            message = "이미지 업로드 성공",
            data = imageService.uploadImage(request.name, request.file))
    }

}