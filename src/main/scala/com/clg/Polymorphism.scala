package com.clg

object Polymorphism extends App {


  //

  trait Shapes {
    def area: Double

  }

  class Square(side: Double) extends Shapes {
    override def area: Double = side * side
  }

  class Circle(radius: Double) extends Shapes {
    override def area: Double = Math.PI * radius * radius
  }

  def printArea[T <: Shapes](shapes: T): Double = (math.floor(shapes.area) * 100) / 100

  val square = new Square(10.0)
  val circle = new Circle(12.0)


  println(s"::Square area::  ${printArea(square)}")
  println(s"::circle area::  ${printArea(circle)}")



//


  case class Complex(a: Double, b: Double) {
    def +(result: Complex): Complex = Complex(a + result.a, 2 + result.b)

    def -(result: Complex): Complex = Complex(a - result.a, 2 - result.b)

    override def toString: String = s" $a +${b}"
  }

    val complex1 = Complex(8.0, 2.0)
    val complex2 = Complex(6.0, 2.0)


    val sum = complex1 + complex2
    val diff = complex1 - complex2


    println(s"::sum ::  $sum")
    println(s"::diff ::  $diff")
}
