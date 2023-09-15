package Clases

open class Person(val id: Int = 0, val name: String = "Pedrito", val status: Boolean = false) {
    open fun isApproved(): Boolean {
        return status
    }
}

class UniversityStudent(id: Int, name: String, status: Boolean) : Person(id, name, status) {
    override fun isApproved(): Boolean {
        println("A university student has course approved always")
        return true
    }
}

class CollegeStudent(id: Int, name: String, status: Boolean) : Person(id, name, status) {

    constructor(name: String, status: Boolean) : this(0, name, status)

    override fun isApproved(): Boolean {
        println("No aprobó su décimo cuatrimestre en la UTVT")
        return false
    }
}
