package com.akka.simple

import akka.actor.{Actor, ActorSystem, Props}

class GreetingActor extends Actor {
  override def receive: Receive = {
    case "hi" => println("Hello World")
    case _ => println("Allowed greeting is 'hi'")
  }
}

object AkkaSimple {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("ActorSystem")

    val greeting = system.actorOf(Props[GreetingActor], name = "greeting")

    greeting ! "hi"
    greeting ! "hola"
  }
}
