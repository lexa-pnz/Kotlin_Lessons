package Ex3

class Exercise3 {
    fun exercise3Str(){
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

    class BadException : Exception()

    fun riskyCode(test: String) {
        println("Start risky code")
        if (test == "Yes") {
            throw BadException()
        }
        println("End risky code")
    }
}