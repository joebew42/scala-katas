package com.restapp.http.routers

import akka.http.scaladsl.model.{ContentTypes, HttpEntity, HttpResponse}
import akka.http.scaladsl.server.Directives._

class HelloRouter() {
  val routes =
    path("hello") {
      get {
        complete {
          HttpResponse(entity = HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to akka-http</h1>"))
        }
      }
    }
}
