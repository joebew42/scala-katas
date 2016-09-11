package com.restapp.http

import org.flywaydb.core.Flyway

class DatabaseMigration(url: String, user: String, password: String) {
  def migrate(): Unit = {
    val flyWay = new Flyway()
    flyWay.setDataSource(url, user, password)
    flyWay.migrate()
  }
}
