package com.restapp.infrastructure

class SlickDatabase() {
  val driver = slick.driver.PostgresDriver
  import driver.api._

  val database = Database.forConfig("database")
  database.createSession()
}
