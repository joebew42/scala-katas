package com.restapp.http

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.http.scaladsl.marshalling.{Marshaller, ToEntityMarshaller}
import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import com.restapp.domain.{User, Value}
import spray.json.DefaultJsonProtocol

trait Serializers extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val userJson = jsonFormat1(User)

  implicit val valueTextPlain: ToEntityMarshaller[Value] = Marshaller.opaque { value =>
    HttpEntity(ContentTypes.`text/plain(UTF-8)`, value.value)
  }
}
