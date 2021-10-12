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
        succes()
    }else{
        gameOver()
    }
}

fun gameOver(){
    println("Your answer is wrong ! You're a bad adc :(")
    println("Game Over")
}

fun succes(){
    println("Well played !, your answer is right !")
}