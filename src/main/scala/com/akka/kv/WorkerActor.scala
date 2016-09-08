package com.akka.kv

import akka.actor.Actor
import com.akka.kv.Messages.Response

import scala.util.Success

class WorkerActor extends Actor {
  override def receive: Receive = {
    case "ping" =>
      println(s"received ping")
      sender ! Response(Success("pong"))
    case _ =>
  }
}
