lazy val config = (project in file("config")).settings(
  organization := "com.example",
  scalaVersion := "2.13.10",
  name := "scalatest-example",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test,
  libraryDependencies += "com.typesafe" % "config" % "1.4.2"
)
