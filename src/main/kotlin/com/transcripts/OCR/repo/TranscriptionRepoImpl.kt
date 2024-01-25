package com.transcripts.OCR.repo

import com.transcripts.OCR.model.payload.TranscriptionResp
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Component

@Component
class TranscriptionRepoImpl(val mongoTemplate: MongoTemplate): TranscriptionRepo {
    override fun createData(): TranscriptionResp {
        TODO("Not yet implemented")
    }
}