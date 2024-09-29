package com.izzat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication()
class TestKotlinApplication

fun main(args: Array<String>) {
    runApplication<TestKotlinApplication>(*args)
}