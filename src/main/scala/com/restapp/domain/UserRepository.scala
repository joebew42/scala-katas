package com.restapp.domain

import scala.concurrent.Future

trait UserRepository {
  def findAll(): Future[List[User]]
}
