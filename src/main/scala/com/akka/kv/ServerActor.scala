package com.akka.kv

import akka.actor.Actor
import com.akka.kv.Messages.Start

class ServerActor extends Actor {
  override def receive: Receive = {
    case Start => println("ready to start ...")
  }
}
