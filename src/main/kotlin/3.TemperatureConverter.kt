// https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems#3

/*
There are three main temperature scales used in the world: Celsius, Fahrenheit, and Kelvin.

In the initial code provided in the following code snippet, write a program that converts a temperature from one scale to another with these formulas:

    Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
    Kelvin to Celsius: ° C = K - 273.15
    Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15

Note that the String.format("%.2f", /* measurement */ ) method is used to convert a number into a String type with 2 decimal places.
*/

/*
Complete the main() function so that it calls the printFinalTemperature() function and prints the following lines.
You need to pass arguments for the temperature and conversion formula.
Hint: you may want to use Double values to avoid Integer truncation during division operations.

27.0 degrees Celsius is 80.60 degrees Fahrenheit.
350.0 degrees Kelvin is 76.85 degrees Celsius.
10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
*/

fun main() {
    val initialMeasurement = readLine()!!.toDouble() // read the initial measurement from the user and convert it to a Double
    val initialUnit = readLine()!! // read the initial unit from the user
    val finalUnit = readLine()!! // read the final unit from the user

    when (initialUnit) {
        "Celsius" ->
            when (finalUnit) {
                "Fahrenheit" -> return printFinalTemperature(initialMeasurement, initialUnit, finalUnit, { celsius: Double -> (celsius * 9/5) + 32 })
                "Kelvin" -> return printFinalTemperature(initialMeasurement, initialUnit, finalUnit, { celsius: Double -> (celsius + 273.15) })
            }
        "Fahrenheit" ->
            when (finalUnit) {
                "Celsius" -> return printFinalTemperature(initialMeasurement, initialUnit, finalUnit, { fahrenheit: Double -> (fahrenheit - 32) * 5/9 })
                "Kelvin" -> return printFinalTemperature(initialMeasurement, initialUnit, finalUnit, { fahrenheit: Double -> (fahrenheit - 32) * 5/9 + 273.15 })
            }
        "Kelvin" ->
            when (finalUnit) {
                "Celsius" -> return printFinalTemperature(initialMeasurement, initialUnit, finalUnit, { kelvin: Double -> kelvin - 273.15 })
                "Fahrenheit" -> return printFinalTemperature(initialMeasurement, initialUnit, finalUnit, { kelvin: Double -> (kelvin - 273.15) * 9/5 + 32 })
            }
    }
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}