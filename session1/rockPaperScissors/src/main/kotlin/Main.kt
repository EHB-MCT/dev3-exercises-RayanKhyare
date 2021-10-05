fun main(){

    val options = arrayOf("Rock","Paper","Scissors")

    println(options.random())
    
    print("Enter your choice: ")
    var choiceInput = readLine()!!
    var randomInput = options.random();

    println("You entered: $choiceInput")

    if (choiceInput == randomInput ) {
        println("Tie !")
    }else if(choiceInput == "Rock" || randomInput == "Paper") {
        println("You lose !")
    }else if(choiceInput == "Rock" || randomInput == "Scissors") {
        println("You won !")
    }else if(choiceInput == "Paper" || randomInput == "Scissors") {
        println("You lose !")
    } else if(choiceInput == "Paper" || randomInput == "Rock") {
        println("You Won !")
    } else if(choiceInput == "Scissors" || randomInput == "Rock") {
        println("You Lose !")
    }else if(choiceInput == "Scissors" || randomInput == "Paper") {
        println("You Won !")
    }

}