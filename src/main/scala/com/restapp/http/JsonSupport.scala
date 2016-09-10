package com.restapp.http

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import com.restapp.domain.User
import spray.json.DefaultJsonProtocol

trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val userJson = jsonFormat1(User)
}
