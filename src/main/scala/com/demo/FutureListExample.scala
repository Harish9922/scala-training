package com.demo
import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration



object FutureListExample extends App {

  def sumFutures(futures: List[Future[Int]]): Future[List[Future[Int]]] = {

    val aggregatedFuture: Future[List[Int]] = Future.sequence(futures)


    val sum: Future[Int] = aggregatedFuture.map(list => list.sum)


    sum.map(result => List(Future(result)))
  }


  val input: List[Future[Int]] = List(Future(1), Future(2), Future(2))


  val result: Future[List[Future[Int]]] = sumFutures(input)

  val finalResult: List[Future[Int]] = Await.result(result,Duration.Inf)

  println(finalResult)

}








