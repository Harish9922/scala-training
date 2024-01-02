package com.clg

object Main extends App{

  trait Profession {
    def profession(): Unit
  }

  case class Student(name: String, rollno: Int, course: String) extends Profession {
    override def profession(): Unit = {
      println(s"${name} with roll number ${rollno} is studying ${course}")
    }
  }

  case class Teacher(name: String, subject: String) extends Profession {
    override def profession(): Unit = {
      println(s"Teacher ${name} teaching ${subject}")
    }
  }

  case class NonTeaching(name: String, role: String) extends Profession {
    override def profession(): Unit = {
      println(s"${role} ${name}")
    }
  }

  val student1 = Student("Venky", 22, "MPC")
  val teacher1 = Teacher("Ramesh", "Maths")
  val nonTeaching1 = NonTeaching("Srikant", "Administrator")

  student1.profession()
  teacher1.profession()
  nonTeaching1.profession()



  // diamond problem

  trait TraitA {
    def area(): Double
  }
  trait TraitB {
    def area(): Double
  }
  class ABC extends TraitA with TraitB {
    override def area(): Double = {
      (10.0 + 20.0) / 2.0
    }
  }
    val abc = new ABC()
    abc.area()
    println(s"Combined Area: ${abc.area()}")
}
