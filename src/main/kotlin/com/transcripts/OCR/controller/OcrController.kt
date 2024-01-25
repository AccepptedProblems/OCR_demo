package com.transcripts.OCR.controller

import com.transcripts.OCR.model.payload.TranscriptionPayload
import com.transcripts.OCR.service.OcrService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/convert")
class OcrController(val ocrService: OcrService) {
    @PostMapping("", consumes = [MediaType.MULTIPART_FORM_DATA_VALUE])
    fun convertTranscriptToSQL(
        @ModelAttribute files: TranscriptionPayload
    ): String {
        return ocrService.convertImageToTranscript(files)
    }
}