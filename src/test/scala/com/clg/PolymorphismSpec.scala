package com.clg

import org.scalatest.funsuite.AnyFunSuite
import com.clg.Polymorphism
import com.clg.Polymorphism.{Circle, Complex, Square, printArea}

class PolymorphismSpec extends AnyFunSuite{

  test(testName = "Square area"){
    val square = new Square(4.0)
    val area = printArea(square)
    assert(Polymorphism.printArea(square) === 16.0)
  }

  test(testName = "Circle area"){
    val circle = new Circle(3.0)
    val area = printArea(circle)
    assert(Polymorphism.printArea(circle) === 28.0)
  }






}
