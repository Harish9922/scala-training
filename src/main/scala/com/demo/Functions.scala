package com.demo

object Functions extends App {
  // anonymous function

  val div = (a: Int, b: Int) => a / b
  println(div(20, 5))

  // closure function

  val num1: Int = 80

  def div(a: Int): Int = {
    val b: Int = 2
    val div = num1 / a / b
    div
  }

  println(div(10))

  // nested function

  def div1(x: Int, y: Int): Int = {
    def nestedFun(z: Int): Int = {
      val div1 = x / y / z;
      div1
    }

    nestedFun(5);
  }

  println(div1(100, 10))

  // pure function

  def mul(a: Double, b: Int): Double = {
    a * b
  }

  println(mul(5.678921, 7))


}
