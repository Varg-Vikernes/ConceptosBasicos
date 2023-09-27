package Collections

val developmentFilter: (Subject) -> Boolean = { subject -> subject.category == SubjectCategory.Development }
val businessFilter: (Subject) -> Boolean = { subject -> subject.category == SubjectCategory.Business }

fun filterSubjects(subjects: List<Subject>, predicateFilter: (Subject) -> Boolean): List<Subject> {
    return subjects.filter(predicateFilter)
}

fun subjectListToStringList(subjects: List<Subject>): List<String> {
    return subjects.map { "${it.id} - ${it.name}" }
}

fun main() {
    val subjectList = subjectList()

    // Filtrar elementos por la categoría "DEVELOPMENT"
    val developmentSubjects = filterSubjects(subjectList, developmentFilter)

    // Filtrar elementos por la categoría "BUSINESS"
    val businessSubjects = filterSubjects(subjectList, businessFilter)

    // Imprimir resultados
    println("Materias de la categoría DEVELOPMENT:")
    developmentSubjects.forEach { subject ->
        println("ID: ${subject.id}, Nombre: ${subject.name}")
    }

    println("\nMaterias de la categoría BUSINESS:")
    businessSubjects.forEach { subject ->
        println("ID: ${subject.id}, Nombre: ${subject.name}")
    }

    // Generar listado de tipo String
    val subjectStringList = subjectListToStringList(subjectList)
    println("\nListado de materias en formato String:")
    subjectStringList.forEach { subjectString ->
        println(subjectString)
    }
}