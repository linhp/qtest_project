import sbt._
import BuildSettings._
import de.johoop.testngplugin.TestNGPlugin._

testNGSettings

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.3" % "test",
  "org.pegdown" % "pegdown" % "1.4.1" % "test", 
  "org.testng" % "testng" % "6.8.5" % "test"
)

testNGVersion := "6.8.8"

testNGOutputDirectory := "target/tesng"

testNGSuites := Seq("hello/src/test/resources/testng.xml")
 
//testOptions in Test += Tests.Argument("-h","target/html-test-report")

//testOptions in Test += Tests.Argument("-u","target/test-reports")

//testOptions in Test += Tests.Argument("-o")
