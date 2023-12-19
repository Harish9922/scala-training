package com.demo

object FibonacciSeries extends App {

  // Fibonacci series (ex:0,1,1,2,3,5,8,13.....n) here n is sum of two preceding numbers

  def fibonacci(n: Int): Unit = {
    var a1: Int = 0
    var a2: Int = 1
    if (n < 1) {
      n
    }
    else {
      print(s"$a1, $a2, ")

      for (i <- 2 to n) {
        var sum: Int = a1 + a2
        a1 = a2
        a2 = sum
        print(s"$sum,")
      }
    }
  }

  println(fibonacci(20))

  // tables

  def tables(n: Int) {


    for (i <- 1 to 10) {

      println(s"$n*$i=${n * i}") //17*1 17*2


    }
  }

   tables(17)

  //  if-else

  val x = 10

  if (x > 5) {
    println("x is greater than 5")
  } else {
    println("x is not greater than 5")
  }

  val y = 7

  if (y > 10) {
    println("y is greater than 10")
  } else if (y > 5) {
    println("y is greater than 5 but not greater than 10")
  } else {
    println("y is 5 or less")
  }

  // even or odd

  val num = 13

  def evenOdd(num: Int) = {
    if (num % 2 == 0) {
      println("number is even")
    } else {
      println("number is odd")
    }
  }
  println(s"${evenOdd(num)}")


  //Nested if else function

  def nested(num: Int) = {

    if (num % 2 == 0) {
      if (num == 20) {
        println("given number is 20")
      } else {
        println(s"given number is $num")
      }
      println("this is even")
    } else {
      if (num == 15) {
        println(s"given number is 15")
      } else {
        println(s"given number is $num")
      }
      println("this is odd")
    }

  }

  println(nested(20))

  //mod and divisible

  println(s"%output => ${10 % 5}") // result is remainder
  println(s"/output => ${10 / 3}") // result is quotient

  //ledger

  def ledger(num: Int): Unit = {

    if (num % 2 == 0) {
      println("number is divisible by 2")
    } else if (num % 3 == 0) {
      println("number is divisible by 3")
    } else if (num % 5 == 0) {
      println(s"number is divisible by 5")
    } else {
      println("number is not divisible by 2,3 and 5")
    }
  }

  println(ledger(100))
}





