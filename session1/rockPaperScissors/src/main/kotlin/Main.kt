fun main(){

    val options = arrayOf("Rock","Paper","Scissors")

    println(options.random())
    print("Enter your choice: ")
    val choiceInput = readLine()!!
    val randomInput = options.random();

    println("You entered: $choiceInput")

    if(choiceInput == randomInput) {
        println("Tie !")
        return
    }

    when(randomInput){
        "Rock" -> if(choiceInput == "Paper") {println("You won !")} else {println("You lose !")}
        "Paper" -> if(choiceInput == "Rock") {println("You lose !")} else {println("You won !")}
        "Scissors" -> if(choiceInput == "Paper") {println("You lose !")} else {println("You won !")}
    }
}