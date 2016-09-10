name := "katas"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.10"
libraryDependencies += "com.typesafe.akka" %% "akka-http-experimental" % "2.4.10"
libraryDependencies += "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.10"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
libraryDependencies += "com.typesafe.akka" %% "akka-http-testkit" % "2.4.10" % "test"
libraryDependencies += "org.mockito" % "mockito-core" % "1.10.19" % "test"
