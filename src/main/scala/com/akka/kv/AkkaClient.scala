package com.akka.kv

import akka.actor.{ActorSystem, Props}
import com.akka.kv.Messages.Start

object AkkaClient {
  private var world: Option[ActorSystem] = None

  def main(args: Array[String]): Unit = {
    val system: ActorSystem = ActorSystem("world")
    world = Some(system)

    val server = system.actorOf(Props[ServerActor], name = "server")

    server ! Start

    while( true ) {
      println("Say something: ")
      Console.in.readLine() match {
        case _ =>
          server ! "some request for worker here"
      }
    }
  }
}
