package com.college

object Main extends App {

  val college = new College(name = "CMR Junior college")
  college.collegeName
  println(s"college name is ${college.collegeName}")

  // case class of student
  val student1 = Student("Hanuman", 21, 1)
  student1.name
  student1.age
  student1.rollno
  val student2 = Student("Venkat", 22, 2)

  val student3 = Student("Shekar", 21, 3)

  //case class of course

  val course1 = Course("MPC", "AAA")
  val course2 = Course("CEC", "AAB")
  val course3 = Course("Bipc", "ABB")

  // case class of course

  val professor1 = Professor("suresh","mathematics")
  professor1.name
  professor1.subject

  val myCollege = college.collegeName

  println(s"${student1.name} admitted to ${myCollege}")
  println(s"${student1.name} enrolled in ${course1.name}")
  println(s"${professor1.name} teaches ${professor1.subject}")

  // pattern matching

  val list:List[Unit]=List(student1,course1)

}


  



