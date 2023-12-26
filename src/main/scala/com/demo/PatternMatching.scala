package com.demo

import scala.annotation.tailrec

object PatternMatching extends App {

  // kth
  @tailrec
  def kEle(list: List[Int], k: Int): Boolean = {
    list match {
      case Nil => false
      case head :: _ if (k == head) => true
      case _ :: tail => kEle(tail,k)//recursive
      case _ => false
    }
  }
  val list = List(1,2,3,4)
  println(s"${kEle(list, 3)}")
  println(s"${kEle(list,5)}")

  // add
  def elemSum(list: List[Int], sum: Int): Int = {
    list match {
      case Nil => sum
      case head :: tail => elemSum(tail, head + sum)

    }
  }
    val list1 = List(1, 2, 3)
    println(s"${elemSum(list1,0)}")
}
