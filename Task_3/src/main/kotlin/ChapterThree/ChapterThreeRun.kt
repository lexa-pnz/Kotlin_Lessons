package ChapterThree

class ChapterThreeRun {
    fun chapter3Run(){
        val game = Game()

        val options = arrayOf("Rock", "Paper", "Scissors")

        val gameChoice = game.getGameChoice(options)
        val userChoice = game.getUserChoice(options)
        val resultGame = game.playGame(userChoice, gameChoice)

        game.printResult(userChoice, gameChoice, resultGame)
    }
}