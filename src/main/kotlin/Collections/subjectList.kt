package Collections

// collections/SubjectList.kt

fun subjectList(): MutableList<Subject> {
    val list = mutableListOf<Subject>()
    list.add(Subject(1, "PWA", SubjectCategory.Business))
    list.add(Subject(2, "Gestion del proceso de desarrollo de software", SubjectCategory.SoftSkills))
    list.add(Subject(3, "Desarrollo movil Integral", SubjectCategory.Business))
    list.add(Subject(4, "Integradora", SubjectCategory.Cloud))

    // Agrega más materias de Ingeniería aquí si es necesario
    return list
}

