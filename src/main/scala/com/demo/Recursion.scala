package com.demo

object Recursion extends App {

  // tail recursive fibonacci series

  def fibonacci(n: Int): Int = {
    def helper(n: Int, a: Int, b: Int): Int = {
      if (n <= 1) {
        a
      }
      else {
        print(s"$a,")
        helper(n - 1, b, a + b)
      }
    }
    helper(n, 0, 1)
  }
  println(fibonacci(8))

  // Recursion : Function repeating itself
  // recursive

  def fib(n: Int): Int = {
    if (n <= 1) {
      n
    }
    else {
      fib(n - 1) + fib(n - 2)
    }
  }
  println(fib(6))

  // factorial ex:5factorial=5*4*3*2*1=120

  def fac(n:Int):Int={
    if (n<=1) {
      n
    }
    else {
      n*fac(n-1)
    }
  }
  println(fac(4))

     // tail recursive

     def fac1(num1: Int): Int = {
       def helper(num1: Int, acc: Int): Int = {
         if (num1<=1) {
           acc
         }
         else {
           helper(num1-1,acc*num1)
         }
       }
        helper(num1, 1)
      }
  println(fac1(5))
}




