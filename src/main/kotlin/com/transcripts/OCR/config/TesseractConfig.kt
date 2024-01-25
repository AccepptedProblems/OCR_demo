package com.transcripts.OCR.config

import net.sourceforge.tess4j.Tesseract
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class TesseractConfig {
    @Bean
    fun getTesseract(): Tesseract{
        val tesseract = Tesseract()
        tesseract.setDatapath("C:/Users/NamNT/OneDrive/Desktop/Intern-NguyenThanhNam/OCR/OCR/tessdata")
        return tesseract
    }
}