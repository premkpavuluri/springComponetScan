package com.prem.practice.cScanPractice.configure

import org.springframework.context.annotation.Configuration
import org.springframework.core.type.classreading.MetadataReader
import org.springframework.core.type.classreading.MetadataReaderFactory
import org.springframework.core.type.filter.TypeFilter

@Configuration
class CustomComponentScanConfig : TypeFilter {
    override fun match(metadataReader: MetadataReader, metadataReaderFactory: MetadataReaderFactory): Boolean {
        println("This is in custom filter")
        val classMetadata = metadataReader.classMetadata
        val className = classMetadata.className
        return className.length <= 3
    }

}