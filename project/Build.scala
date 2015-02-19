import sbt._
import Keys._
import com.typesafe.sbt.SbtStartScript
import de.johoop.testngplugin.TestNGPlugin._


object ProjectBuild extends Build {
  import BuildSettings._
  import Dependencies._

  seq(SbtStartScript.startScriptForJarSettings: _*)

  lazy val scalaTest =  "org.scalatest" %% "scalatest" % "2.2.1" % "test"

  lazy val scala = "org.scala-lang" % "scala-library" % "2.10.2"

  lazy val testng = "org.testng" % "testng" % "6.8.5" % "test"

  lazy val pegdown = "org.pegdown" % "pegdown" % "1.4.1" % "test" //used in html report

  lazy val junitInterface = "com.novocode" % "junit-interface" % "0.11-RC1" % "test"

  lazy val junitxml= "ca.seibelnet" % "junitxml" % "0.2" % "test"

  lazy val junit = "junit" % "junit" % "4.10" % "test"

  lazy val mockito = "org.mockito" % "mockito-core" % "1.9.5"


  lazy val root = Project(id = "repo3", base = file("."))
    .aggregate(qtest) 

  lazy val qtest = Project(id = "qtest", base = file("qtest"))
    .settings(basicSettings: _*)
    .settings( libraryDependencies ++= Seq(scalaTest, junit, junitInterface, testng ))


} 
