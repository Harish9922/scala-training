package com.clg
object clg extends App {

  abstract class Clg extends App {

    def profession(): Unit
  }
  case class Student(name: String, rollno: Int, course: String) extends Clg {
    override def profession(): Unit = {
      println(s"${student1.name} with roll number ${student1.rollno} is studying ${student1.course}")
    }
  }
  case class Teacher(name: String, subject: String) extends Clg {
    override def profession(): Unit = {
      println(s"Teacher ${teacher1.name} teaching ${teacher1.subject}")
    }
  }
  case class NonTeaching(name: String, role: String) extends Clg {
    override def profession(): Unit = {
      println(s"${nonTeaching1.role} ${nonTeaching1.name}")
    }
  }
  val student1 = Student("Venky", 22, "MPC")
  student1.name
  student1.rollno
  student1.course
  val teacher1 = Teacher("Ramesh", "Maths")
  teacher1.name
  val nonTeaching1 = NonTeaching("Srikant", "Administrator")
  nonTeaching1.name

  student1.profession()
  teacher1.profession()
  nonTeaching1.profession()
}