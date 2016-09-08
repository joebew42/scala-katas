package com.akka.kv

import scala.util.Try

object Messages {
  sealed trait Command
  sealed trait Request extends Command {
    val key: Long
  }

  case class Ping(workerNumber: Int) extends Command

  case class Create(key: Long, value: String) extends Request
  case class Read(key: Long) extends Request

  case class Response(message: Try[String])
  case class Start(numberOfWorkers: Int = 1)

}
