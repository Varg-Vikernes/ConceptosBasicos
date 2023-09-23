package lambda

fun calculateOperation(x: Int, y: Int, operation: (x: Int, y: Int) -> Int): Int {
    return operation(x, y)
}

fun main(): Unit {
    val x = 10
    val y = 5

    println("parameters: $x , $y")
    val addition: Int = calculateOperation(x, y) { x, y -> x + y }
    println("result of addition $addition");

    val subtraction: Int = calculateOperation(x, y) { x, y -> x - y }
    println("result of subtraction $subtraction");

    val multiplication: Int = calculateOperation(x, y) { x, y -> x * y }
    println("result of multiplication $multiplication");

    val divicion: Int = calculateOperation(x, y) { x, y -> x / y }
    println("result of divicion $divicion");
}
