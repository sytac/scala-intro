package exercise1

import org.scalatest.{Matchers, FlatSpec}

class FactorialSpec extends FlatSpec with Matchers {

  "calculate" should "return 1 for n = 1" in {
    Factorial.calculate(1) should be (1)
  }

  it should "return 6 for n = 3" in {
    Factorial.calculate(3) should be (6)
  }

  it should "return 40320 for n = 8" in {
    Factorial.calculate(8) should be (40320)
  }

  it should "return 30414093201713378043612608166064768844377641568960512000000000000 for n = 50" in {
    Factorial.calculate(50) should be (BigInt("30414093201713378043612608166064768844377641568960512000000000000"))
  }
}
