package com.restapp.domain

import scala.concurrent.Future

class UserRepository() {
  def findAll(): Future[List[User]] = {
    Future.successful(List(User("joe")))
  }
}
