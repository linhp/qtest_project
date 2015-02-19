import sbt._
import BuildSettings._
//import de.johoop.testngplugin.TestNGPlugin._

//seq(SbtStartScript.startScriptForJarSettings: _*)

libraryDependencies ++= Seq(
//  "org.scalatest" %% "scalatest" % "2.1.3" % "test",
  "org.pegdown" % "pegdown" % "1.4.1" % "test"
//  "org.testng" % "testng" % "6.8.8" % "test",
//  "com.novocode" % "junit-interface" % "0.11-RC1" % "test->default",
//  "junit" % "junit" % "4.11" % "test"
)

testNGSettings

testNGVersion := "6.8.8"

testNGOutputDirectory := "target/testng-reports"

testNGSuites := Seq("qtest/src/test/resources/testng.xml")

// Generate ScalaTest reports

testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/scala-html-reports")

testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/scala-xml-reports")

testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-o")
