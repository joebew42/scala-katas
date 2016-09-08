package com.akka.kv

import scala.util.Try

object Messages {
  sealed trait Request {
    val key: Long
  }

  case class Create(key: Long, value: String) extends Request
  case class Read(key: Long) extends Request

  case class Response(message: Try[String])

  case class Start(numberOfWorkers: Int = 1)
}
