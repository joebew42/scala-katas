package com.restapp.http

import akka.http.scaladsl.server.Directives._
import com.restapp.http.routers.{HelloRouter, UsersRouter}

class Application(val helloRouter: HelloRouter, val holaRouter: UsersRouter) {
  val routes =
    helloRouter.routes ~
      holaRouter.routes
}
