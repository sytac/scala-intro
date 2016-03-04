package basic.collections

import scala.util.Random

/**
  * Created by pierangeloc on 3/4/16.
  */
object Collections_01 extends App {

  val temperatures = List.fill(100)(new Random().nextInt(50) - 20)
  println("Temperatures: "  + temperatures.map(_ + "°C"))


  def findMaxIterative(temps: List[Int]): Int = {
    var highest = Int.MinValue
    for (temp <- temps) {
      highest = Math.max(temp, highest)
    }
    highest
  }

  def findMaxIterative2(temps: List[Int]): Int = {
    var highest = Int.MinValue
    for (index <- 0 until temps.size) {
      highest = Math.max(temps(index), highest)
    }
    highest
  }

  def findMaxIterative3(temps: List[Int]): Int = {
    var highest = Int.MinValue
    var index = 0
    while (index < temps.size) {
      highest = Math.max(temps(index), highest)
    }
    for (i <- 0 until temps.size) {
      highest = Math.max(temps(i), highest)
    }
    highest
  }

  def findMaxFunct(temps: List[Int]): Int = temps.foldLeft(Int.MinValue)(Math.max)

  /**
    * Ex1: Transform a list of Int to a list of squares of each element
    *
    */
  def toSquares(xs: List[Int]): List[Int] = ???

  /**
    * Ex2: Calculate the sum of the elements in a list
    */
  def sum(xs: List[Int]): Int = ???

  /**
    * Ex3: Implement the Ex2 with foldRight
    */
  def sumWithFoldRight(xs: List[Int]): Int = ???


  /**
    * Ex4: Extract all the characters from the input list that represent a digit
    */
  def filterPositiveNumbers(int: List[Char]): List[Char] = ???

  /**
    * Return the initial segment of the list of size n. If n <= 0, return the empty list, if n > xs.size, return xs
    * N.B. This type of signature defines a curried function
    */
  def take[A](n: Int)(xs: List[A]) = ???

  /**
    * Perform the scalar product between 2 vectors whose components are represented by the input lists
    * E.g. xs = List(1, 2, 3, 4) and ys = List(5, 6, 7, 8)
    *      scalarProduct(xs, ys) = 1 * 5 + 2 * 6 + 3 * 7 + 4 * 8 = 70
    */
  def scalarProduct(xs: List[Int], ys: List[Int]): Int = ???

  /**
    * Revert the input list.
    * Suggestions: use recursion, or fold (
    */
  def reverse[A](xs: List[A]): List[A] = ???

}
