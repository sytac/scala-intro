package exercise3

import org.scalatest.{Matchers, FlatSpec}

class FormatResultSpec extends FlatSpec with Matchers {
  "format" should "format the result of computations as expected" in {
    val opName = "opName"
    val in = 5

    FormatResult.format(opName, in, _ + 1) should be (s"The $opName of $in is ${in + 1}.")
    FormatResult.format(opName, in, _ - 1) should be (s"The $opName of $in is ${in - 1}.")
    FormatResult.format(opName, in, -_) should be (s"The $opName of $in is ${-in}.")
  }
}
