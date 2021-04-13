package com.example.controller

import com.example.entities.User
import io.ktor.application.*
import io.ktor.response.*

class UserController {

  suspend fun index(call: ApplicationCall) {
    val list = listOf<User>(
      User("testtest","hogehoge", "hinoatarusakamichi@gmail.com"),
      User("testtest","hogehoge", "hinoatarusakamichi@gmail.com"),
      User("testtest","hogehoge", "hinoatarusakamichi@gmail.com"),
      User("testtest","hogehoge", "hinoatarusakamichi@gmail.com")
    )
    call.respond(list)
  }
}