package Clases

class Student(val name: String = "Pedrito", val age: Int = 0) {
    fun action() {
        val message = "it is going to approve"
        println(message)
    }
}

fun main() {
    val studentWithDefaults = Student() // Objeto con valores por defecto
    val studentWithCustomData = Student("Juanito", 20) // Objeto con datos personalizados

    println("Estudiante con valores por defecto:")
    println("Nombre: ${studentWithDefaults.name}")
    println("Edad: ${studentWithDefaults.age}")

    println("\nEstudiante con datos personalizados:")
    println("Nombre: ${studentWithCustomData.name}")
    println("Edad: ${studentWithCustomData.age}")
}
