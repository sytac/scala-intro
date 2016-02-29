package part1

import exercise2.SumNElements
import exercise3.FormatResult
import exercise4.ListContains
import org.scalatest.{WordSpecLike, Matchers}


class ExpressionsTest extends Matchers with WordSpecLike {

  "Ex1: Factorial function" must {
    "return 1 for n = 1" in {
      Expressions.factorial(1) should be (1)
    }

    "return 6 for n = 3" in {
      Expressions.factorial(3) should be (6)
    }

    "return 40320 for n = 8" in {
      Expressions.factorial(8) should be (40320)
    }

    "return 30414093201713378043612608166064768844377641568960512000000000000 for n = 50" in {
      Expressions.factorial(50) should be (BigInt("30414093201713378043612608166064768844377641568960512000000000000"))
    }
  }

  "Ex2: Sum function" must {
    "return 1 for list = List(1,2) and untilElement = 1" in {
      Expressions.sum(List(1, 2), 1) should be(1)
    }

    "return 9 for list = List(1,3,5,7,9) and untilElement = 3" in {
      Expressions.sum(List(1, 3, 5, 7, 9), 3) should be(9)
    }

    "return 100 for list = List(1,3,5,7,9,11,13,15,17,19,21,23) and untilElement = 10" in {
      Expressions.sum(List(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23), 10) should be (100)
    }

    "return 202500000000 for list = (1 to 1000000 by 2).toList and untilElement = 450000" in {
      Expressions.sum((1 to 1000000 by 2).toList, 450000) should be (BigInt("202500000000"))
    }
  }

  "Ex3: Format function" must {
    "format the result of computations as expected" in {
      val in = 5
      Expressions.format("Factorial", in, _ + 1) should be (s"The Factorial of 5 is 120.")
      Expressions.format("Square", in, x => x * x) should be (s"The Square of  of 5 is 25.")
      Expressions.format("Negation", in, -_) should be (s"The Negation of 5 is -5.")
    }
  }

  "Ex4: FormatGeneric function" must {
    "format the result of computations as expected" in {
     val inputString: String = "Sytac"
      def stringOp = (s: String) => s.toUpperCase

      val inputList: List[Int] = (1 to 10).toList
      def listOp(list: List[Int]) = list.map(_ * 2)

      val intVal = 100
      def cube: (Int) => Int = (i: Int) => i * i * i

      Expressions.formatGeneric("UpperCase", inputString, stringOp) should be (s"The UpperCase of Sytac is SYTAC.")
      Expressions.formatGeneric("DoubleElements", inputList, listOp) should be (s"The DoubleElements of List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) is List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20).")
      Expressions.formatGeneric("Cupe", intVal, cube) should be (s"The Cube of 100 is 1000000.")

    }
  }

  "Ex5: FormatGeneric function" must {
    "check if an element is present in a List as expected" in {
      Expressions.contains(List(1,2,3), 1) should be (true)
      Expressions.contains(List(1,2,3), 2) should be (true)
      Expressions.contains(List(1,2,3), 3) should be (true)
      Expressions.contains(List(1,2,3), 4) should be (false)
      Expressions.contains((1 to 5000).toList, 4999) should be (true)
      Expressions.contains((1 to 1000000 by 2).toList, 499999) should be (true)
    }

  }

}
