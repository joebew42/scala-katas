package com.restapp.http

import akka.http.scaladsl.model.HttpResponse
import com.restapp.domain.{Value, ValueRepository}
import com.restapp.http.routers.ValuesRouter
import org.mockito.Mockito._
import org.scalatest.mockito.MockitoSugar

import scala.concurrent.Future

class ValuesRouterSpec extends RouterSpec with MockitoSugar {
  val repository = mock[ValueRepository]
  val router = new ValuesRouter(repository)

  val routes = router.routes

  "retrieves a value" in {
    val value = Value("\"path/for/value\"", "a value")
    when(repository.findByKey("path/for/value")).thenReturn(Future(value))

    Get("/values/path/for/value") ~> routes ~> check {
      responseAs[String] shouldBe "a value"
    }
  }
}
