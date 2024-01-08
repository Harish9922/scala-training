package com.demo

object RemoveDuplicates extends App{

  // remove duplicates of  List(1, 2, 3, 4, 4, 5, 2, 1, 2, 3, 6)

  def removeDuplicates(lst: List[Int]): List[Int] = lst match {
    case Nil => Nil
    case head :: tail => head :: removeDuplicates(tail.filter(_ != head))
  }
  val inputList = List(1, 2, 3, 4, 4, 5, 2, 1, 2, 3, 6)
  val result1 = removeDuplicates(inputList)

  println(result1)

// remove consective duplicates of List(1, 1, 1, 2, 2, 1, 1, 2, 3, 4, 4, 3, 2, 1)

  def removeConsecutiveDuplicates(lst: List[Int]): List[Int] = lst match {
    case Nil => Nil
    case head :: tail =>
      tail match {
        case `head` :: rest => removeConsecutiveDuplicates(tail)
        case _ => head :: removeConsecutiveDuplicates(tail)
      }
  }

  val list = List(1, 1, 1, 2, 2, 1, 1, 2, 3, 4, 4, 3, 2, 1)
  val result = removeConsecutiveDuplicates(list)

  println(result)


}
