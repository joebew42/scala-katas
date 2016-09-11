package com.restapp.http

import akka.http.scaladsl.server.Directives._
import com.restapp.http.routers.{HelloRouter, UsersRouter, ValuesRouter}

class Application(val helloRouter: HelloRouter,
                  val holaRouter: UsersRouter,
                  val valuesRouter: ValuesRouter) {
  val routes =
    helloRouter.routes ~
      holaRouter.routes ~
      valuesRouter.routes
}
