package com.transcripts.OCR.model.entity

import org.springframework.data.annotation.Id

data class Transcriptions(
    @Id
    val id: Int,
    val studentName: String,
    val classes: String,
    val point: Number
)
