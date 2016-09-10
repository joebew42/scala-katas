package com.restapp.http

import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{Matchers, WordSpec}
import org.scalatest.concurrent.ScalaFutures

trait RouterSpec extends WordSpec with Matchers with ScalatestRouteTest with JsonSupport with ScalaFutures
