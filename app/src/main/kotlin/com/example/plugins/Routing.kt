package com.example.plugins

import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.features.*
import io.ktor.application.*
import io.ktor.jackson.*
import io.ktor.response.*
import io.ktor.request.*
import com.example.controller.UserController

fun Application.configureRouting() {
    install(AutoHeadResponse)

    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }

    val userController = UserController()

    routing {
        route("/api") {
            route("/v1") {
                route("users") {
                    get {
                        userController.index(call)
                    }
                }
            }
        }
    }
}
