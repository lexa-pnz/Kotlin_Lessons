package Ex11

class Ex11Main {

    fun ex11Str(){
        val myLambdas = Lambdas()

        println("Convert 2.5kg to Pounds: ${myLambdas.getConversionLambda("KgsToPounds")(2.5)}")

        val kgsToPoundsLambda = myLambdas.getConversionLambda("KgsToPounds")
        val poundsToUSTonsLambda = myLambdas.getConversionLambda("PoundsToUSTons")

        val kgsToUSTonsLambda = myLambdas.combine(kgsToPoundsLambda, poundsToUSTonsLambda)

        val value = 17.4
        println("$value kgs is ${myLambdas.convert(value, kgsToUSTonsLambda)} US tons")
    }
}