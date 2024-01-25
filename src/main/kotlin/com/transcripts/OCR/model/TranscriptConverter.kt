package com.transcripts.OCR.model

import net.sourceforge.tess4j.Tesseract
import org.springframework.stereotype.Component
import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.io.FileOutputStream


@Component
class TranscriptConverter(val tesseract: Tesseract) {
    fun convert(file: MultipartFile): String {
        val convFile: File = convertMultipartToFile(file)
        convFile.deleteOnExit()
        val result = tesseract.doOCR(convFile)
        convFile.delete()
        return result
    }

    fun convertMultipartToFile(multipartFile: MultipartFile): File {
        val convFile = File(multipartFile.originalFilename)
        val fos = FileOutputStream(convFile)
        fos.write(multipartFile.bytes)
        fos.close()
        return convFile
    }
}