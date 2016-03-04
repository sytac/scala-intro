package basic.classes


/**
  * Create a class Complex that represents a complex number.
  * Complex numbers are constituted by a real and an imaginary part: z = re + i im
  *
  * Ex1:
  * - Create one constructor that accepts 2 doubles, one for real and one for imaginary part.
  * - Define default values for this constructor to 0, 0
  * - Create a companion object with a factory method polar(magnitude: Double, angle: Double): Complex
  *   z = re + i im === magnitude * cos(angle) + i * sin(angle)
  *
  * Ex2:
  * - Override the toString() method so that the complex number is represented as re + i im
  * - Add a + and a - method that perform addition and subtraction of complex numbers
  * - Add a * operator that performs the multiplication for a complex number
  *
  * Ex3:
  * If you try to add/subtract/multiply complex numbers with Double, you get a compilation error
  * - Provide the companion object with an implicit converter method `fromReal` that accepts a Double and returns the equivalent Complex number
  * - Bring the companion object into scope together with its converter method and check the conversion allows you to write e.g. 1 + new Complex(3,4)
  *
  */
class Complex() {

}
