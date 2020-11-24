package com.mika.jader

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JaderApplication

fun main(args: Array<String>) {
    runApplication<JaderApplication>(*args)
}
