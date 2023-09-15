import Clases.CollegeStudent
import Clases.Person
import Clases.UniversityStudent

fun main() {
    val person = Person(1, "Alice", true)
    val universityStudent = UniversityStudent(2, "Bob", true)
    val collegeStudent = CollegeStudent(2, "Bob", false)

    println("${person.name} is ${if (person.isApproved()) "approved" else "not approved"}")
    println("${universityStudent.name} is ${if (universityStudent.isApproved()) "approved" else "not approved"}")
    println("${collegeStudent.name} is ${if (collegeStudent.isApproved()) "approved" else "not approved"}")

}
