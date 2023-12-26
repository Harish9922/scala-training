package com.demo

import org.scalatest.funsuite.AnyFunSuite
import com.demo.PatternMatching

class PatternMatchingSpec extends AnyFunSuite{

  test(testName = "checking the value is in the list is true "){
    val list = List(1,2,3,4)
    val check = 1
    assert(PatternMatching.kEle(list,check))
  }

  test(testName = "checking the value is not in the list is false"){
    val list1 = List(1,2,3,4)
    val check = 5
    assert(!PatternMatching.kEle(list1,check))
  }

  test(testName = " elemSum in the list" ){
    assert(PatternMatching.elemSum(List(1,2,3),0) === 6)
  }

}
