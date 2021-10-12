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
        challengeTwo()
    }else{
        gameOver()
    }
}

fun challengeTwo(){
    println("While you've been farming peacefully, the jungler ganks you !")
    println("To have a chance to survive you have 2 choices: low or high. A dice will be thrown.")
    println("Low is a number between 1 and 3 and high between 4 and 6 , Good luck !")

    val randomChoice = rollDice()
    println(randomChoice)
    val userAnswer = readLine()


    when(userAnswer) {
        "low" -> if (randomChoice == 1 || randomChoice == 2 || randomChoice == 3){
            succes()
            challengeThree()
        }else{
            gameOver()
        }
            "high" -> if (randomChoice == 4 || randomChoice == 5 || randomChoice == 6){
                succes()
                challengeThree()
            }else{
                gameOver()
            }
    }
}


fun challengeThree(){
    println("You survived a gank, I expected no less from you ;)")
    println("But before you now stands a complicated dilemma.\n" +
            "The opposing adc wants to duel you but you don't have any items to compete with.\n" +
            "You have the choice between 3 items: a sword, an ak47 or a stick ")

    val userAnswer = readLine()

    when(userAnswer){
        "sword" -> {
            println("The sword wasn't enough so you decided to run away to the challenge before, you coward !")
            challengeTwo()}
        "ak47" -> {
            succes()
            println("The ak47 was apparently sufficient to shoot down your enemy")}

        "stick" -> {
            gameOver()
            println("Why would you choose a wooden stick though?")}
    }
}


fun rollDice(): Int{
    return (1..6).random()
}



fun gameOver(){
    println("Your answer is wrong ! You're a bad adc :(")
    println("Game Over")
}

fun succes(){
    println("Well played !, your answer is right !")
}