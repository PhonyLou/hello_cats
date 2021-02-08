package com.training.hellocats

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class PersonSpec extends AnyWordSpec with Matchers {

  "Person Spec" should {
    "convert person object to Json" in {
      import JsonWriterInstance._
      val person = Person("Tom", "Tom@abc.com")

      Json.toJson(person) shouldEqual JsObject(Map("name" -> JsString("Tom"), "email" -> JsString("Tom@abc.com")))

    }
  }
}
