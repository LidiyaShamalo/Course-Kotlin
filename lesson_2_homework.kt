fun main(){
     // вывод 5 показателей на экран
    println("Максимальная температура воздуха: 27")
    println("Минимальная температура воздуха: 15")
    println("Влажность воздуха: 26%")
    println("Скорость ветра: 5 м/с")
    println("Солнечно")
    
     // Инициализация переменных типа Int
    var maxYesterdayTemperature = 27
    var minYesterdayTemperature = 16
    var maxTodayTemperature = 32
    var minTodayTemperature = 18
    
	 // Перевод существующих переменных температур в тип Double
    var maxYesterdayTemperatureDouble = maxYesterdayTemperature.toDouble()
    var minYesterdayTemperatureDouble = minYesterdayTemperature.toDouble()
    var maxTodayTemperatureDouble = maxTodayTemperature.toDouble()
    var minTodayTemperatureDouble = minTodayTemperature.toDouble()
    
     //Нахождение разницы температур
    var differenceMaxTemperature = maxTodayTemperatureDouble - maxYesterdayTemperatureDouble 
    var differenceMinTemperature = minTodayTemperatureDouble - minYesterdayTemperatureDouble
    
     //Вывод результатов на экран
    println(differenceMaxTemperature)
    println(differenceMinTemperature)
    
}