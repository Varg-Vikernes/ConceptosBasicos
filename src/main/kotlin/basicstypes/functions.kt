package basicstypes

import java.time.LocalDate

fun TopLevelSubtraction(x: Int, y: Int): Int {
    return x - y
}

fun printName(name: String) {
    println("This is: $name")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun printPerson(
    name: String,
    email: String = "",
    birthDate: LocalDate = LocalDate.now()
) {
    println("Name is $name and the email is $email and birth date is $birthDate")
}

fun main() {

    val unit = printName(name = "paquito")
    println("unit is $unit")

    val result = addition(1, 2)
    println("Result is $result")

    val topLevelResult = topLevelSubtraction(5, 4)
    println("TopLevelSubtraction result is $topLevelResult")
    printPerson(name = "paquito" , email = "xd@gmail.xom" , LocalDate.parse("2000-01-02"))

    println("**************************************************")

    val multiplicationResult = multiplication(5, 4)
    println("Multiplication result is $multiplicationResult")

    try {
        val divisionResult = division(10, 2)
        println("Division result is $divisionResult")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
