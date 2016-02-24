package exercise3

import org.scalatest.{Matchers, FlatSpec}

class FormatResultSpec extends FlatSpec with Matchers {
  "format" should "format the result of computations as expected" in {
    val in = 5

    FormatResult.format("Factorial", in, _ + 1) should be (s"The Factorial of 5 is 120.")
    FormatResult.format("Square", in, x => x * x) should be (s"The Square of  of 5 is 25.")
    FormatResult.format("Negation", in, -_) should be (s"The Negation of 5 is -5.")
  }

  "format generic" should "format the result of computations as expected" in {

    val inputString: String = "Sytac"
    def stringOp = (s: String) => s.toUpperCase

    val inputList: List[Int] = (1 to 10).toList
    def listOp(list: List[Int]) = list.map(_ * 2)

    val intVal = 100
    def cube: (Int) => Int = (i: Int) => i * i * i

    FormatResult.formatGeneric("UpperCase", inputString, stringOp) should be (s"The UpperCase of Sytac is SYTAC.")
    FormatResult.formatGeneric("DoubleElements", inputList, listOp) should be (s"The DoubleElements of List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) is List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20).")
    FormatResult.formatGeneric("Cupe", intVal, cube) should be (s"The Cube of 100 is 1000000.")

  }

}
