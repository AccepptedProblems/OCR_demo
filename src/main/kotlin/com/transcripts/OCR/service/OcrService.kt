package com.transcripts.OCR.service

import com.transcripts.OCR.model.payload.TranscriptionPayload
import com.transcripts.OCR.model.payload.TranscriptionResp
import reactor.core.publisher.Mono
import java.io.File

interface OcrService {
    fun convertImageToTranscript(files: TranscriptionPayload): String
}