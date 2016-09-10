package com.restapp.http

import com.restapp.domain.{User, UserRepository}
import com.restapp.http.routers.UsersRouter

class UsersRouterSpec extends RouterSpec {

  val repository = new UserRepository()
  val usersRouter = new UsersRouter(repository)

  trait Context {
    val routes = usersRouter.routes
  }

  "Users service" should {
    "retrieve users list" in new Context {
      Get("/users") ~> routes ~> check {
        responseAs[List[User]].isEmpty shouldBe false
      }
    }
  }

}
