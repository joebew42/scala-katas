package com.restapp.infrastructure

import com.restapp.domain.{User, UserRepository}

import scala.concurrent.Future

class FakeUserRepository() extends UserRepository {
  def findAll(): Future[List[User]] = {
    Future.successful(List(User("joe")))
  }
}
