package com.restapp.infrastructure

import com.restapp.domain.{Value, ValueRepository}

import scala.concurrent.Future

class SlickValueRepository(val slickDatabase: SlickDatabase) extends ValueRepository {

  import slickDatabase._
  import slickDatabase.driver.api._

  class Values(tag: Tag) extends Table[Value](tag, "values") {
    def key = column[Option[String]]("key", O.PrimaryKey)
    def value = column[String]("value")
    def * = (key, value) <> ((Value.apply _).tupled, Value.unapply)
  }

  protected val values = TableQuery[Values]

  override def findByKey(key: String): Future[Option[Value]] = {
    database.run(values.filter(_.key === key).result.headOption)
  }

}
