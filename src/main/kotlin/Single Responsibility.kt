//package org.example
////The Class Should Have Only One Reason To Changes
////Solving the God Class Problem
////A divide-and-conquer ......
//
//fun main() {
//    // Create instances of manager classes
//    val professorManager = ProfessorManager()
//    val studentManager = StudentManager()
//
//    // Use the manager classes to handle professors and students
//    professorManager.addProfessors(listOf("Ali", "Ahmed", "Azz Eldin", "Shehab Eldin"), listOf(1, 2, 3, 4, 5))
//    studentManager.addStudents(listOf("Ibrahim", "Mostafa", "Murad", "Mahmoud", "Ziad"), listOf(10, 20, 30, 40, 50))
//}
//
//
//
// class University(){
//
//
//
// //Bad code
//
////     fun ProfessorManager(){}
//
//
////      Bad code
////     fun StudentManager(){}
//
//
//
////     fun lectures(){}
////
//
//
//
//
// }
//
//
//
//
//class ProfessorManager {
//    fun addProfessors(names: List<String>, ids: List<Int>) {
//        println("Professors' Names: $names")
//        println("Professors' IDs: $ids")
//    }
//}
//
//class StudentManager {
//    fun addStudents(names: List<String>, ids: List<Int>) {
//        println("Students' Names: $names")
//        println("Students' IDs: $ids")
//    }
//}