package com.restapp.domain

import scala.concurrent.Future

trait ValueRepository {
  def findByKey(key: String): Future[Option[Value]]
}
