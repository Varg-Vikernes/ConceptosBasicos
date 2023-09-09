package basicstypes

fun topLevelSubtraction (x: Int , y: Int) :Int {
    return x -y;
}

fun multiplication(x: Int, y: Int): Int {
    return x * y
}

fun division(x: Int, y: Int): Double {
    if (y != 0) {
        return x.toDouble() / y.toDouble()
    } else {
        throw IllegalArgumentException("Division by zero is not allowed.")
    }
}
