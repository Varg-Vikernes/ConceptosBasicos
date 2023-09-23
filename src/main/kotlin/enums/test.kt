package enums

fun main() {
    println("precio del metal ${PreciousMetal.PLATINUM} en el mercado  ${PreciousMetal.PLATINUM.price()}");
    println("precios del metal ${PreciousMetal.GOLD} en el mercado ${PreciousMetal.GOLD.price()}");
    println("precios del metal ${PreciousMetal.PALLADIUM} en el mercado ${PreciousMetal.PALLADIUM.price()}");
    println("precios del metal ${PreciousMetal.RHODIUM} en el mercado ${PreciousMetal.RHODIUM.price()}");
    println("dia ${WeekDay.TUESDAY} en el salon ${WeekDay.TUESDAY.nextDay()}");

    val today = WeekDay.MONDAY

    val nextDay = when (today) {
        WeekDay.MONDAY -> WeekDay.TUESDAY
        WeekDay.TUESDAY -> WeekDay.WEDNESDAY
        WeekDay.WEDNESDAY -> WeekDay.THURSDAY
        WeekDay.THURSDAY -> WeekDay.FRIDAY
        WeekDay.FRIDAY -> WeekDay.SATURDAY
        WeekDay.SATURDAY -> WeekDay.SUNDAY
        WeekDay.SUNDAY -> WeekDay.MONDAY
    }

    println("Día $today en el salón $nextDay")
}