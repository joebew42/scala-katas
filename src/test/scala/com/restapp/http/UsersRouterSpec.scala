package com.restapp.http

import com.restapp.domain.{User, UserRepository}
import com.restapp.http.routers.UsersRouter
import org.mockito.Mockito.when
import org.scalatest.mockito.MockitoSugar

import scala.concurrent.Future

class UsersRouterSpec extends RouterSpec with MockitoSugar {
  val repository = mock[UserRepository]
  val usersRouter = new UsersRouter(repository)

  val routes = usersRouter.routes

  "retrieve users list" in {
    when(repository.findAll()).thenReturn(Future(List(User("joe"))))

    Get("/users") ~> routes ~> check {
      responseAs[List[User]].isEmpty shouldBe false
    }
  }
}
