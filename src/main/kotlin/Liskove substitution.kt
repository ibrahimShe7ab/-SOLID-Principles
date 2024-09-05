package org.example
//
//// All classes must have identical contract to execute.
//// If We Have A Main Class has inheritance child class must change between this child class easily
//
//fun main() {
//
//    val professorManager: Manager = ProfessorManager()
//    val studentManager: Manager = StudentManager()
//
//     professorManager.addEntities(listOf("Ali", "Ahmed", "Azz Eldin", "Shehab Eldin"), listOf(1, 2, 3, 4, 5))
//    studentManager.addEntities(listOf("Ibrahim", "Mostafa", "Murad", "Mahmoud", "Ziad"), listOf(10, 20, 30, 40, 50))
//}
//
// interface Manager {
//    fun addEntities(names: List<String>, ids: List<Int>)
//}
//
//class ProfessorManager : Manager {
//    override fun addEntities(names: List<String>, ids: List<Int>) {
//        println("Professors' Names: $names")
//        println("Professors' IDs: $ids")
//    }
//}
//
//class StudentManager : Manager {
//    override fun addEntities(names: List<String>, ids: List<Int>) {
//        println("Students' Names: $names")
//        println("Students' IDs: $ids")
//    }
//}