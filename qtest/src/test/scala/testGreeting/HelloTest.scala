package testGreeting

import org.scalatest.FunSuite
import greeting.hello

class HelloTest extends FunSuite {
   
    test("Scala Suite2 Test1 ") { expect("HI") {hello.greet("hi") } }

}