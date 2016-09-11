package com.restapp.http.routers

import akka.http.scaladsl.server.Directives._
import com.restapp.domain.ValueRepository
import com.restapp.http.Serializers

class ValuesRouter(repository: ValueRepository) extends Serializers {
  val routes =
    pathPrefix("values" / Remaining) { remainingPath =>
      get {
        complete {
          repository.findByKey(remainingPath)
        }
      }
    }
}
