package io.github.pierangeloc.base

/**
  * Created by pierangeloc on 2/20/16.
  */
abstract class Base {

  implicit val users = List(1, 2, 3)

}

trait Logger {
  def log(s: String) = println(s)
}
