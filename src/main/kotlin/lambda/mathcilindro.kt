package lambda

fun calculateCylinderArea(height: Int, diameter: Int, calculateArea: (Int, Int) -> Double): Double {
    return calculateArea(height, diameter)
}

fun main(): Unit {
    val height = 7
    val diameter = 6

    println("parameters: height = $height, diameter = $diameter")

    val calculateCylinderTotalArea: (Int, Int) -> Double = { h, d ->
        val radius = d / 2.0
        val lateralArea = 2 * Math.PI * radius * h
        val topBottomArea = 2 * Math.PI * radius * radius
        lateralArea + topBottomArea
    }

    val areaTotal: Double = calculateCylinderArea(height, diameter, calculateCylinderTotalArea)
    println("result of cylinder area calculation: $areaTotal")
}