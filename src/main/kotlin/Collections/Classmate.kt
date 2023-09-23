package Collections


fun main () : Unit{
    val mutableList = mutableListOf("Florencio", "Vinicio", "Carlos")

    val immutableList = mutableList.toList()

    println("Lista de compañeros:")
    for (companero in immutableList) {
        println(companero)
    }
}

