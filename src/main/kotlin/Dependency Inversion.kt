// do not depend on main class  but depend on interfaces






//                                      Bad Code
//class ProfessorManager {
//    fun addEntities(names: List<String>, ids: List<Int>) {
//        println("Professors' Names: $names")
//        println("Professors' IDs: $ids")
//    }
//}
//
//class StudentManager {
//    fun addEntities(names: List<String>, ids: List<Int>) {
//        println("Students' Names: $names")
//        println("Students' IDs: $ids")
//    }
//}
//
//class CourseManager {
//    fun addEntities(names: List<String>, ids: List<Int>) {
//        println("Courses' Names: $names")
//        println("Courses' IDs: $ids")
//    }
//}
//
//fun main() {
//    val professorManager = ProfessorManager()
//    val studentManager = StudentManager()
//    val courseManager = CourseManager()
//
//    professorManager.addEntities(listOf("Ali", "Ahmed", "Azz Eldin", "Shehab Eldin"), listOf(1, 2, 3, 4, 5))
//    studentManager.addEntities(listOf("Ibrahim", "Mostafa", "Murad", "Mahmoud", "Ziad"), listOf(10, 20, 30, 40, 50))
//    courseManager.addEntities(listOf("CS", "MATH", "JAVA", "C", "CSS"), listOf(101, 201, 301, 401, 501))
//}
//
//
//


interface Manager {
    fun addEntities(names: List<String>, ids: List<Int>)
}

class ProfessorManager : Manager {
    override fun addEntities(names: List<String>, ids: List<Int>) {
        println("Professors' Names: $names")
        println("Professors' IDs: $ids")
    }
}

class StudentManager : Manager {
    override fun addEntities(names: List<String>, ids: List<Int>) {
        println("Students' Names: $names")
        println("Students' IDs: $ids")
    }
}

class CourseManager : Manager {
    override fun addEntities(names: List<String>, ids: List<Int>) {
        println("Courses' Names: $names")
        println("Courses' IDs: $ids")
    }
}

fun main() {
    val professorManager: Manager = ProfessorManager()
    val studentManager: Manager = StudentManager()
    val courseManager: Manager = CourseManager()

    professorManager.addEntities(listOf("Ali", "Ahmed", "Azz Eldin", "Shehab Eldin"), listOf(1, 2, 3, 4, 5))
    studentManager.addEntities(listOf("Ibrahim", "Mostafa", "Murad", "Mahmoud", "Ziad"), listOf(10, 20, 30, 40, 50))
    courseManager.addEntities(listOf("CS", "MATH", "JAVA", "C", "CSS"), listOf(101, 201, 301, 401, 501))
}



















