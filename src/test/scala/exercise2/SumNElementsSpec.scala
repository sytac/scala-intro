package exercise2

import org.scalatest.{FlatSpec, Matchers}

class SumNElementsSpec extends FlatSpec with Matchers {

  "calculate" should "return 1 for list = List(1,2) and untilElement = 1" in {
    SumNElements.calculate(List(1, 2), 1) should be(1)
  }

  it should "return 9 for list = List(1,3,5,7,9) and untilElement = 3" in {
    SumNElements.calculate(List(1, 3, 5, 7, 9), 3) should be(9)
  }

  it should "return 100 for list = List(1,3,5,7,9,11,13,15,17,19,21,23) and untilElement = 10" in {
    SumNElements.calculate(List(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23), 10) should be (100)
  }

  it should "return 202500000000 for list = (1 to 1000000 by 2).toList and untilElement = 450000" in {
    SumNElements.calculate((1 to 1000000 by 2).toList, 450000) should be (BigInt("202500000000"))
  }

}
