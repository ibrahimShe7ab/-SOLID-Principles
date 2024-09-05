




//                                                              not collect all futures into one interface but divide him to mani interfaces
//
//
////                                                                          Bad Code
////interface Manager {
////    fun addEntities(names: List<String>, ids: List<Int>)
////    fun removeEntities(ids: List<Int>)
////    fun updateEntity(id: Int, name: String)
////}
////
////
////class Profissor():Manager{
////    override fun addEntities(names: List<String>, ids: List<Int>) {
////        TODO("Not yet implemented")
////    }
////
////    override fun removeEntities(ids: List<Int>) {
////        TODO("Not yet implemented")
////    }
////
////    override fun updateEntity(id: Int, name: String) {
////        TODO("Not yet implemented")
////    }
////}class student():Manager{
////    override fun addEntities(names: List<String>, ids: List<Int>) {
////        TODO("Not yet implemented")
////    }
////
////    override fun removeEntities(ids: List<Int>) {
////        TODO("Not yet implemented")
////    }
////
////    override fun updateEntity(id: Int, name: String) {
////        TODO("Not yet implemented")
////    }
////}
//
//
//interface EntityManager {
//    fun addEntities(names: List<String>, ids: List<Int>)
//}
//
//interface RemovableEntityManager {
//    fun removeEntities(ids: List<Int>)
//}
//
//interface UpdatableEntityManager {
//    fun updateEntity(id: Int, name: String)
//}
//
//
//
//
//
//class ProfessorManager : EntityManager, UpdatableEntityManager {
//    override fun addEntities(names: List<String>, ids: List<Int>) {
//        println("Professors' Names: $names")
//        println("Professors' IDs: $ids")
//    }
//
//    override fun updateEntity(id: Int, name: String) {
//        println("Updating Professor with ID $id to name $name")
//    }
//}
//
//class StudentManager : EntityManager {
//    override fun addEntities(names: List<String>, ids: List<Int>) {
//        println("Students' Names: $names")
//        println("Students' IDs: $ids")
//    }
//}
//
//
//
//
//
//
//
//
