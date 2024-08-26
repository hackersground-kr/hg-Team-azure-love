package com.project.nanuriserver.global.common.config.image

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
data class ImageProperties (

    @Value("\${azure-storage.storage-connection-string}") val storageConnectionString: String,

)