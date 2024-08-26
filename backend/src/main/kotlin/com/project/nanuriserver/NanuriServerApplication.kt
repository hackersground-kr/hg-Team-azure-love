package com.project.nanuriserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class NanuriServerApplication

fun main(args: Array<String>) {
    runApplication<NanuriServerApplication>(*args)

}
