package com.prem.practice.cScanPractice.annotations

import org.springframework.stereotype.Component

@Component
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class Animal
