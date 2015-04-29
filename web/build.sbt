name := """Web4b"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.1-api"),
  "org.hibernate" % "hibernate-entitymanager" % "4.3.8.Final"
)


fork in run := true

fork in run := true