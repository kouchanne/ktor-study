package com.example.plugins

import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.features.*
import io.ktor.application.*
import io.ktor.jackson.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {
    install(AutoHeadResponse)

    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }

    routing {
        get("/api") {
            call.respond(mapOf("hello" to "world"))
        }
    }
}
