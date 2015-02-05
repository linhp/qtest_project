import sbt._
import Keys._

object ProjectBuild extends Build {
  lazy val root = Project(id = "myproject", base = file("."))
    .aggregate(hello) 
  lazy val hello = Project(id = "hello", base = file("hello"))

} 
