package com.prem.practice.cScanPractice

import com.prem.practice.cScanPractice.configure.CustomComponentScanConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.FilterType

@SpringBootApplication
@ComponentScan(includeFilters = [ComponentScan.Filter(type = FilterType.CUSTOM, classes = [CustomComponentScanConfig::class])])
class CScanPracticeApplication

fun main(args: Array<String>) {
	val runApplication = runApplication<CScanPracticeApplication>(*args)

	val beans = runApplication.beanDefinitionNames
//	val filteredBeans = Arrays.stream(beans)
//		.filter { bean -> !bean.contains("org.springframework") && !bean.contains("componentScanAnnotationFilterApp") }
//		.collect(Collectors.toList())

	println(beans.count())

	println("is Dog bean present: ${beans.contains("dog")}")
	println("is Cat bean present: ${beans.contains("cat")}")
}
