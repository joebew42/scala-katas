package com.akka.kv

import akka.actor.{ActorRef, ActorSystem, Props}
import com.akka.kv.Messages.{Command, Ping, Start}

object AkkaClient {
  private var world: Option[ActorSystem] = None

  def main(args: Array[String]): Unit = {
    val system: ActorSystem = ActorSystem("world")
    world = Some(system)

    val server = system.actorOf(Props[ServerActor], name = "server")

    server ! Start(10)

    handleInput(server)
  }

  def handleInput(server: ActorRef): Unit = {
    while (true) {
      println("Issue a command: ")
      Console.in.readLine() match {
        case line => server ! buildCommandFrom(line)
        case _ =>
      }
    }
  }

  val commandWorkerRE = """^\s*(\w+)\s+(\d+)\s*$""".r

  def buildCommandFrom(line: String): Command = line match {
    case commandWorkerRE(command, worker) => command match {
      case "ping" => Ping(worker.toInt)
    }
    case _ => null
  }
}
