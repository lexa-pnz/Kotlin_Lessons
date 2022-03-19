package Ex2

class Exercise2 {
    fun exercise2Str(){
        val test: String = "No"
        try {
            println("Start try")
            riskyCode(test)
            println("End try")
        } catch (e: BadException) {
            println("Bad Exception")
        } finally {
            println("Finally")
        }
        println("End of main")
    }
}

class BadException : Exception()

fun riskyCode(test: String) {
    println("Start risky code")
    if (test == "Yes") {
        throw BadException()
    }
    println("End risky code")
}