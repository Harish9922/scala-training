package com.clg

object Diamond extends App{
  trait TraitA {
    def area(): Double
  }
  trait TraitB {
    def area(): Double
  }
  class ABC extends TraitA with TraitB {
    override def area(): Double = {
      (10.0 + 20.0) / 2.0
    }
  }
  val abc = new ABC()
  abc.area()
  println(s"Combined Area: ${abc.area()}")

}
