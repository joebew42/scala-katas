package com.akka.kv

import akka.actor.{Actor, ActorRef, Props}
import com.akka.kv.Messages.{Ping, Response, Start}

import scala.util.Success

class ServerActor extends Actor {

  var workers = Vector.empty[ActorRef]

  override def receive: Receive = {
    case Start(numberOfWorkers) =>
      workers = ((1 to numberOfWorkers) map startWorker).toVector
      context become handleRequests
  }

  def handleRequests: Receive = {
    case Ping(workerNumber) =>
      workers(workerNumber % workers.size) ! "ping"
    case Response(Success(message)) =>
      println(s"Response: ${message}")
    case _ =>
      println("request for worker ...")
  }

  def startWorker(number: Int) = {
    context.actorOf(Props[WorkerActor], name = s"w${number}")
  }
}
