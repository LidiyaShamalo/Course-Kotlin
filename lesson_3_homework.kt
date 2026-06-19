fun main() {
    val temperature = -15
    val precipitation = "clear"

    if (temperature < 0) {
        println("На улице мороз!")
        when (precipitation) {
            "snow"  -> println("Идет снег, надень теплую куртку и шапку.")
            "rain"  -> println("Происходит что-то странное!")
            "clear" -> println("Осадков вроде нет, просто тепло оденься.")
            else    -> println("Неправильно введена информация об осадках")
        }
    } else {
        println("На улице тепло или умеренно.")
        when (precipitation) {
            "rain"  -> println("Возьми зонт или дождевик!")
            "snow"  -> println("Странно, но идет мокрый снег.")
            "clear" -> println("Погода отличная, можно гулять налегке.")
            else    -> println("Неправильно введена информация об осадках")
        }
    }
}