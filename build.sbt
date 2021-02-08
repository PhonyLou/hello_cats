import sbtrelease.Version

name := "hello_cats"
version := "1.0.0"
scalaVersion := "2.13.4"

val scalazVersion = "7.1.3"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.1.0",
  "org.scalatest" %% "scalatest" % "3.1.1" % Test,
  "org.scalatestplus" %% "mockito-3-2" % "3.1.1.0" % Test
)

scalacOptions ++= Seq(
  "-Xfatal-warnings"
)
