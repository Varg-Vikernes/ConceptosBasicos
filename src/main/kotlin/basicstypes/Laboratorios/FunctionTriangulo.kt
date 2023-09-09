package basicstypes.Laboratorios

fun main() {
    val n = 5 // Número de filas para el triángulo


    for (i in 1..n) {
        for (j in 1..(n - i)) {
            print("  ")
        }

        // Números ascendentes
        for (j in 1..i) {
            print("* ")
        }

        // Números descendentes
        for (j in (i - 1) downTo 1) {
            print("* ")
        }

        println()
    }
}


