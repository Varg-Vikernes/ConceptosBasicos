package lambda

fun main() {
    val calcularAreaTotalCilindro: (Double, Double) -> Double = { height, diameter ->
        val radio = diameter / 2.0 // Calculamos el radio a partir del diámetro
        val areaSuperficieLateral = 2 * Math.PI * radio * height
        val areaTapas = 2 * Math.PI * radio * radio
        areaSuperficieLateral + areaTapas
    }

// Ejemplo de uso
    val heightCilindro = 7.0
    val diameterCilindro = 6.0
    val areaTotal = calcularAreaTotalCilindro(heightCilindro, diameterCilindro)

    println("El área total del cilindro con altura $heightCilindro y diámetro $diameterCilindro es $areaTotal")

}