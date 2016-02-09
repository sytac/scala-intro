package exercise4

import org.scalatest.{Matchers, FlatSpec}

class ListContainsSpec extends FlatSpec with Matchers {
  "contains" should "check if an element is present in a List as expected" in {
    ListContains.contains(List(1,2,3), 1) should be (true)
    ListContains.contains(List(1,2,3), 2) should be (true)
    ListContains.contains(List(1,2,3), 3) should be (true)
    ListContains.contains(List(1,2,3), 4) should be (false)
    ListContains.contains((1 to 5000).toList, 4999) should be (true)
    ListContains.contains((1 to 1000000 by 2).toList, 499999) should be (true)
  }
}
