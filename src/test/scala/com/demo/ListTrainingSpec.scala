package com.demo

import org.scalatest.funsuite.AnyFunSuite
import com.demo.ListTraining

class ListTrainingSpec extends AnyFunSuite{

  test(testName = "ListTrainingSpec"){
    assert(ListTraining.multiElemBy2(List(1,2), List()) === List(2,4))
  }

  test(testName = "reversed list"){
    assert(ListTraining.reverseList(List(1,2,3)) === List( 3, 2, 1))
  }
}


