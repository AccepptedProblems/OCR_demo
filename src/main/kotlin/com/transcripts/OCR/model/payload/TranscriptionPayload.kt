package com.transcripts.OCR.model.payload

import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.io.Serializable

data class TranscriptionResp(
    val id: Int,
    val studentName: String,
    val classes: String,
    val point: Number
)

data class TranscriptionPayload(
    val images: MultipartFile
)
