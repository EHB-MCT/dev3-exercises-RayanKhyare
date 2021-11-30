open class Duolingo(val roundSize: Int = 5, val language : String) {


    val words = mutableListOf<Word>(
        Word("Hello", "Hallo", "en"),
        Word("Today", "Vandaag", "en"),
        Word("Food", "Voedsel", "en"),
        Word("Triangle", "Driehoek", "en"),
        Word("Bird", "Vogel", "en"),
        Word("Ghost", "Spook", "en"),
        Word("Night", "Nacht", "ens"),
        Word("Shoes", "Schoenen", "en"),
        Word("Earth", "Aarde", "en"),
        Word("Jail", "Gevangenis", "en"),
        Word("Bonjour", "Hallo", "fr"),
        Word("Aujourd'hui", "Vandaag", "fr"),
        Word("Nourriture", "Voedsel", "fr"),
        Word("Triangle", "Driehoek", "fr"),
        Word("Oiseau", "Vogel", "fr"),
        Word("Fantome","Spook", "fr"),
        Word("Nuit","Nacht", "fr"),
        Word("Chaussures","Schoenen", "fr"),
        Word("Terre","Aarde", "fr"),
        Word("Prison","Gevangenis", "fr")
    )

    fun play(){

val filterLanguage = words.filter {
    it.language == language
}

        val numberOfWords = roundSize;
        val randomWord = filterLanguage.shuffled().take(numberOfWords).toMutableSet()

        val selectedWord = randomWord.random()
        println("Amount of rounds : $roundSize")
println("Chosen language : $language")
        while (randomWord.isNotEmpty()){

            println("What is the translation of ${selectedWord.original}")
            val userAnswer = readLine()

            if (selectedWord.translated == userAnswer) {
                println("Good job !")
                randomWord.remove(selectedWord)
            }else{
                println("False answer. Try again later")
            }
            println("They are currently " + randomWord.count() + "words left")
        }
    }
}





