package ControlFlow

fun main() {
    val range = 1..10
    for (count in range) {
        println("common range $count")
    }

    val reverseRange = 10 downTo 1
    for (count in reverseRange) {
        println("reverseRange: $count")
    }

    for (count in reverseRange step 2) {
        println("another way to print a reverseRange $count")
    }
}
