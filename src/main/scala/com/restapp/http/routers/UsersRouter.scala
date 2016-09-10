package com.restapp.http.routers

import akka.http.scaladsl.server.Directives._
import com.restapp.domain.UserRepository
import com.restapp.http.JsonSupport

class UsersRouter(repository: UserRepository) extends JsonSupport {
  val routes =
    path("users") {
      get {
        complete {
          repository.findAll()
        }
      }
    }
}
