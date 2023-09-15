package Clases

class Student(val name: String = "Pedrito", val age: Int = 18) {
    var email: String = ""

    constructor(email: String) : this() {
        this.email = email
    }

    fun action() {
        println("Student action called")
    }
}

class Subject(val name: String) {
    constructor() : this("Español")

    fun action() {
        println("Subject Name: $name")
    }
}

fun main() {
    val student1 = Student("")
    student1.action()
    println("Name: ${student1.name}, age ${student1.age}, email ${student1.email}")

    val student2 = Student("xd")
    student2.action()
    println("Name: ${student2.name}, age ${student2.age}, email ${student2.email}")

    val subject1 = Subject("Math")
    subject1.action()

    val subject2 = Subject()
    subject2.action()
}
