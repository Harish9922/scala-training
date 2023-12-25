package com.demo

object ListTraining extends App {

  val list = List(1,2,3,4,10,5,6,7,8,7)

  //list.map(elem=>elem*2)
  val list2 = list.map(elem=>elem*2)
  println(list2)

 val  listofLists = List(List(1,3),List(3,4),List(1,2))

  //listofLists.map(elem=>elem*2)
 val l2 = listofLists.map(list=>list.map(elem=>elem*2))
  println(l2)

  // flatten
  val  listofLists1 = List(List(1,3),List(3,4),List(1,2))
  val l3 = listofLists1.flatten
  println(l3)

  // flatmap

  val l4 = listofLists.flatMap(list=>list.map(elem=>elem*2))
  println(l4)

// flatmap using list

  def multiBy2(x: Int): List[Int] = List(x * 2)
  val l5 = list.flatMap(multiBy2)
    println(l5)


   //pattern matching
  
  def multiElemBy2(list: List[Int], acc: List[Int]): List[Int] = {
    list match {
      case Nil => acc
      case head :: tail => multiElemBy2(tail, acc ::: List(head * 2))
    }
  }
  println(multiElemBy2(list,List()))

  // reverse

  val list1 = List(1,2,3,4,10,5,6,7,8,7)
  val reversedList = reverseList(list1)
  def reverseList(list1:List[Int]):List[Int] ={
    list.reverse
  }
  println(reversedList)

}

