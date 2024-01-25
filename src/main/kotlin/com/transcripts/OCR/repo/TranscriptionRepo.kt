package com.transcripts.OCR.repo

import com.transcripts.OCR.model.payload.TranscriptionResp

interface TranscriptionRepo {
    fun createData(): TranscriptionResp
}