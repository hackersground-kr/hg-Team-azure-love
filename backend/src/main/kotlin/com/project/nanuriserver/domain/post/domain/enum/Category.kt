package com.project.nanuriserver.domain.post.domain.enum

import com.project.nanuriserver.domain.post.exception.InvalidCategoryException

enum class Category {

    SHARE, SALE
    ;

    companion object {
        fun CategorySafe(category: String) = try {
            valueOf(category)
        } catch (e: IllegalArgumentException) {
            throw InvalidCategoryException
        }
    }
}
