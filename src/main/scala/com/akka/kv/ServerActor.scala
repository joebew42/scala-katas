package com.akka.kv

import akka.actor.Actor
import com.akka.kv.Messages.Start

class ServerActor extends Actor {
  override def receive: Receive = {
    case Start =>
      println("ready to start ...")
      context become handleRequests
  }

  def handleRequests: Receive = {
    case _ =>
      println("request for worker ...")
  }
}
