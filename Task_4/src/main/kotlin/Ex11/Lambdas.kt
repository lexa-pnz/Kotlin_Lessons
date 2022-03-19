package Ex11

typealias DoubleConversion = (Double) -> Double

class Lambdas {

    fun convert(x: Double,
                converter: DoubleConversion) : Double {
        val result = converter(x)
        println("$x is converted to $result")
        return result
    }

    fun getConversionLambda(str: String): DoubleConversion {
        if (str == "CentigradeToFahrenheit") {
            return { it * 1.8 + 32 }
        }else if (str == "KgsToPounds") {
            return { it * 2.204623 }
        } else if (str == "PoundsToUSTons") {
            return { it / 2000.0 } } else {
            return { it }
        }
    }

    fun combine(lambda1: DoubleConversion,
                lambda2: DoubleConversion): DoubleConversion {
        return { x: Double -> lambda2(lambda1(x)) }
    }
}