package com.restapp.infrastructure

import com.restapp.domain.{Value, ValueRepository}
import org.h2.engine.Database

import scala.concurrent.Future

class SlickH2ValueRepository() extends ValueRepository {
  override def findByKey(key: String): Future[Value] = {
    Future.successful(Value("",""))
  }
}
