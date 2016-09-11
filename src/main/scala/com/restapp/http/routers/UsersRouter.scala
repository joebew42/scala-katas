package com.restapp.http.routers

import akka.http.scaladsl.server.Directives._
import com.restapp.domain.UserRepository
import com.restapp.http.Serializers

class UsersRouter(repository: UserRepository) extends Serializers {
  val routes =
    path("users") {
      get {
        complete {
          repository.findAll()
        }
      }
    }
}
