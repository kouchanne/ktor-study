package com.example.entities

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty

class User (
  @JsonProperty("name") val name: String,
  @JsonProperty("password") val password : String,
  @JsonProperty("email") val email : String
)