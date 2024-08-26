package com.project.nanuriserver.domain.post.client.api

import com.project.nanuriserver.domain.post.client.dto.Post
import com.project.nanuriserver.domain.post.client.dto.request.PostModifyRequest
import com.project.nanuriserver.domain.post.client.dto.request.PostRegisterRequest
import com.project.nanuriserver.domain.post.service.PostService
import com.project.nanuriserver.global.common.dto.response.BaseResponse
import com.project.nanuriserver.global.common.dto.response.BaseResponseData
import io.swagger.v3.oas.annotations.Operation
import jakarta.validation.Valid
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/post")
class PostController(
    private val postService: PostService
) {
    @PostMapping
    @Operation(summary = "게시글 등록")
    fun registerPost(@RequestBody request: PostRegisterRequest): BaseResponse {
        postService.registerPost(request)
        return BaseResponse.ok(message = "게시글 등록 성공")
    }

    @GetMapping("/my")
    @Operation(summary = "내 게시글 조회")
    @PageableAsQueryParam
    fun getMyPost(pageable: Pageable): BaseResponseData<Page<Post>> {
        return BaseResponseData.ok(
            message = "나의 게시물 불러오기 성공",
            data = postService.findMyPost(pageable))
    }

    @GetMapping("/category")
    @Operation(summary = "카테고리별 게시글 조회")
    @PageableAsQueryParam
    fun getPostsByCategory(pageable: Pageable, @RequestParam category: String): BaseResponseData<Page<Post>> {
        return BaseResponseData.ok(
            message = "카테고리별 게시물 불러오기 성공",
            data = postService.findByCategory(pageable, category))
    }

    @GetMapping("/status")
    @Operation(summary = "게시글 상태별 게시글 조회")
    @PageableAsQueryParam
    fun getPostsByStatus(pageable: Pageable, @RequestParam status: String): BaseResponseData<Page<Post>> {
        return BaseResponseData.ok(
            message = "상태별 게시물 불러오기 성공",
            data = postService.findByStatus(pageable, status))
    }

    @GetMapping
    @Operation(summary = "전체 게시글 조회")
    @PageableAsQueryParam
    fun getAllPosts(pageable: Pageable): BaseResponseData<Page<Post>> {
        return BaseResponseData.ok(
            message = "상태별 게시물 불러오기 성공",
            data = postService.findAll(pageable))
    }

    @PatchMapping
    @Operation(summary = "게시글 수정")
    @PageableAsQueryParam
    fun getPostsByStatus(@RequestParam id: Long, @RequestBody @Valid request: PostModifyRequest): BaseResponse {
        postService.modify(id, request.title, request.content, request.imageUuid, request.status)
        return BaseResponse.ok(message = "게시글 수정 성공")
    }

    @GetMapping("/search")
    @Operation(summary = "게시글 검색")
    fun getMyPost(pageable: Pageable, @RequestParam term: String): BaseResponseData<Page<Post>> {
        return BaseResponseData.ok(
            message = "게시글 조회 성공",
            data = postService.search(pageable, term))
    }
}
