package Collections
// collections/Subject.kt

enum class SubjectCategory {
        Development,
        Business,
        SoftSkills,
        Cloud,
        HumanResource
}

data class Subject(val id: Int, val name: String, val category: SubjectCategory)
