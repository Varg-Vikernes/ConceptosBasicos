package ControlFlow.ejercicios

fun main() {
    val height = 5 // Altura del triángulo
    for (i in 1..height) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}
