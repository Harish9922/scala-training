package com.demo

import org.scalatest.funsuite.AnyFunSuite
import com.demo.Recursion

class RecursionSpec extends AnyFunSuite{

  test(testName = "fibonacci"){
    assert(Recursion.fibonacci(3) === 1)
  }

  test(testName = "fibonacci number"){
    assert(Recursion.fib(6) === 8)
  }

  test(testName = "factorial"){
    assert(Recursion.fac(4) === 24)
  }

  test(testName = "factorial number"){
    assert(Recursion.fac1(3) === 6)
  }
}
