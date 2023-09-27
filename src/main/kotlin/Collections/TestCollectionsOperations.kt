package Collections

fun main() {
    val subjectList = subjectList()

    // Filtrar elementos por categoría (en este caso, Cloud)
    val resultFilter = subjectList.filter { it.category == SubjectCategory.Cloud }

    // Mapear los nombres de las materias a mayúsculas
    val resultMap = subjectList.map { it.name.uppercase() }.toList()

    // Imprimir los resultados del filtro
    println("Materias de la categoría Cloud:")
    resultFilter.forEach { subject ->
        println("ID: ${subject.id}, Nombre: ${subject.name}")
    }

    // Imprimir los resultados del mapeo
    println("Nombres de las materias en mayúsculas:")
    resultMap.forEach { name ->
        println(name)
    }
}