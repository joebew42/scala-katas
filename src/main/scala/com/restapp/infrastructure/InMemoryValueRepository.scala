package com.restapp.infrastructure

import com.restapp.domain.ValueRepository

import scala.collection.immutable.HashMap
import scala.concurrent.Future

class InMemoryValueRepository() extends ValueRepository {
  val values = HashMap(
    "im/exists" -> "[\"one\", \"two\", \"three\"]",
    "other/path" -> "a content with random values\nnew line"
  )

  override def findByKey(key: String): Future[String] = {
    Future.successful(values.getOrElse(key, ""))
  }
}
