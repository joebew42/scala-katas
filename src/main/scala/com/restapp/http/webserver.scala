package com.restapp.http

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.restapp.http.routers.{HelloRouter, UsersRouter, ValuesRouter}
import com.restapp.infrastructure.{FakeUserRepository, InMemoryValueRepository}

import scala.io.StdIn

object WebServer {
  def main(args: Array[String]) {

    implicit val system = ActorSystem("my-system")
    implicit val materializer = ActorMaterializer()
    implicit val executionContext = system.dispatcher

    val helloRouter = new HelloRouter()
    val usersRouter = new UsersRouter(new FakeUserRepository())
    val valuesRouter = new ValuesRouter(new InMemoryValueRepository())
    val application = new Application(helloRouter, usersRouter, valuesRouter)

    val bindingFuture = Http().bindAndHandle(application.routes, "localhost", 8080)

    println(s"Server online at http://localhost:8080/\nPress RETURN to stop...")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done
  }
}
