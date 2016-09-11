package com.restapp.infrastructure

import com.restapp.domain.{Value, ValueRepository}

import scala.collection.immutable.HashMap
import scala.concurrent.Future

class InMemoryValueRepository() extends ValueRepository {
  val values = HashMap(
    "im/exists" -> "[\"one\", \"two\", \"three\"]",
    "other/path" -> "a content with random values\nnew line"
  )

  override def findByKey(key: String): Future[Value] = {
    val value = Value(key, values.getOrElse(key, ""))
    Future.successful(value)
  }
}
