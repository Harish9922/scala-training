package com.demo

import org.scalatest.funsuite.AnyFunSuite
import com.demo.FibonacciSeries

class FibonacciSeriesSpec extends AnyFunSuite{

  test(testName = "check the fibonacci"){
    assert(FibonacciSeries.fibonacci(4) === 3)
  }

}
