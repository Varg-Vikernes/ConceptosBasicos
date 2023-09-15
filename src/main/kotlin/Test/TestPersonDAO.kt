package Test
import Clases.Person
import dao.PersonDAO

fun main() {
    val personDAO = PersonDAO()

    // Crear una persona
    val newPerson = Person(1, "Alice", true)
    val savedPerson = personDAO.save(newPerson)
    println("Saved Person: ${savedPerson.name}")

    // Actualizar una persona
    val updatedPerson = personDAO.update(savedPerson)
    println("Updated Person: ${updatedPerson.name}")

    // Eliminar una persona
    personDAO.deleteById(savedPerson.id)
}
