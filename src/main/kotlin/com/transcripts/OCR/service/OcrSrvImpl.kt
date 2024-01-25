package com.transcripts.OCR.service

import com.transcripts.OCR.model.TranscriptConverter
import com.transcripts.OCR.model.payload.TranscriptionPayload
import com.transcripts.OCR.model.payload.TranscriptionResp
import com.transcripts.OCR.repo.TranscriptionRepo
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.io.File

@Service
class OcrSrvImpl(val transcriptionRepo: TranscriptionRepo, val converter: TranscriptConverter): OcrService {
    override fun convertImageToTranscript(files: TranscriptionPayload): String {
        return converter.convert(files.images)
    }
}