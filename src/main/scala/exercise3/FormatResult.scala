package exercise3

/**
  * Exercises about higher order functions
  */
object FormatResult {

  /**
    * Implement a function that formats the result of a function application
    * on Int values in the format: "The <operation name> of <input> is <result>."
    */
  def format(operationName: String, input: Int, function: Int => Int): String = ???

  /**
    * Implement a function that formats the result of a function application
    * on a generic type values in the format: "The <operation name> of <input> is <result>."
    */
  def formatGeneric[A](operationName: String, input: A, function: A => A): String = ???


}
