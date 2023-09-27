package ecxeptions
fun riseException(): Nothing {
    throw RuntimeException("Null default Exception")
}

fun textLength(text: String?): Int {
    try {
        val result: Int = when (text) {
            null -> riseException()
            else -> text.length
        }
        return result
    } catch (e: RuntimeException) {
        println("kotlin.Unit ${e.message}")
        return -1 
    }
}

fun main() {
    val nullText: String? = null
    val nonNullText: String = "hi there"

    println("La longitud del texto es ${textLength(nonNullText)}")
    println("La longitud del texto es ${textLength(nullText)}")
}
