package com.demo

object Palindrome extends App {

  def palindrome(n: Int): Int = {
    def helper(n: Int, reversed: Int): Int = {
      if (n == 0) {
        reversed
      }
      else {
        helper(n / 10, reversed * 10 + n % 10)
      }
    }
    helper(n, 0)

  }
  val n:Int=12321
  val acc= palindrome(n)
  if (n == acc) {
    println("number is palindrome")
  }
  else {
    println("number is not palindrome")
  }
}

