package basic.expressions

/**
  * Learn some basic language features
  */
object Expressions {

  /**
    * Ex1 Calculate the factorial of number n using recursion.
    * The solution should work also for big numbers, so make it tail-recursive
    */
  def factorial(n: Int): BigInt = ???
  /**
    * Ex2 Calculate the sum of the first n elements of a List.
    * The solution should work also for very long lists, so it should be implemented in a tail-recursive fashion
    */
  def sum(list: List[Int], untilElement: Int): BigInt = ???

  /**
    * Ex3 Implement a function that formats the result of a function application
    * on Int values in the format: "The <operation name> of <input> is <result>."
    */
  def format(operationName: String, input: Int, function: Int => Int): String = ???

  /**
    * Ex4 Implement a function that formats the result of a function application
    * on a generic type values in the format: "The <operation name> of <input> is <result>."
    */
  def formatGeneric[A](operationName: String, input: A, function: A => A): String = ???

  /**
    * Ex5 Implement a function that checks via pattern matching
    * and tail recursion if an element is present in a List.
    */
  def contains(list: List[Int], element: Int): Boolean = ???


}
