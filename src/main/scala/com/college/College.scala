package com.college

class College (name:String) {
   def collegeName: String = this.name

  def enrollStudent(student: Student, course: Course): Unit = {
  }

   // case class of student

  case class Student(name: String, age: Int, rollno:Int)


   // case class of course

  case class Course(name: String,code: String)

   // case class of professor

   case class Professor(name : String,subject: String)

}

object College {

 case object MyCollege

 def admitStudent(student: Student): Unit = {

 }
}

