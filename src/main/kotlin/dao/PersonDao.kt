package dao

import Clases.Person
import Interfaces.PersonRepository

class PersonDAO : PersonRepository {
    override fun save(person: Person): Person {
        println("New Person: ${person.name}")
        return person
    }

    override fun update(person: Person): Person {
        println("Object person Update: ${person.name}")
        return person
    }

    override fun deleteById(id: Int) {
        println("Person id: $id has been deleted")
    }
}
