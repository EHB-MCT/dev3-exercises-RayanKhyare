fun main(){
    println("Welcome to the Summoner's Rift !")
    challengeOne()


}

fun challengeOne(){

    println("You have just spawned and are heading for the botlane")
    println("To kill your first minion, you must solve a first riddle")
    println("Name me a champions in the game that comes from Demacia")

    val correctAnswers = setOf<String>("fiora","galio","garen","kayle","lucian","lux","morgana")

    val userAnswer = readLine()
    if(correctAnswers.contains(userAnswer)){
        challengeTwo()
    }else{
        gameOver()
    }
}

fun challengeTwo(){
    println("Well played !, your answer was right !")
    println("While you've been farming peacefully, the jungler ganks you !")
    println("To have a chance to survive you have 2 choices: low or high. A dice will be thrown.")
    println("Low is a number between 1 and 3 and high between 4 and 6 , Good luck !")

    val randomChoice = rollDice()
    println(randomChoice)
    val userAnswer = readLine()


    when(userAnswer) {
        "low" -> if (randomChoice == 1 || randomChoice == 2 || randomChoice == 3){
            succes()
        }else{
            gameOver()
        }
            "high" -> if (randomChoice == 4 || randomChoice == 5 || randomChoice == 6){
                succes()
            }else{
                gameOver()
            }
    }
}

fun rollDice(): Int{
    return (0..6).random()
}

fun gameOver(){
    println("Your answer is wrong ! You're a bad adc :(")
    println("Game Over")
}

fun succes(){
    println("Well played !, your answer is right !")
}