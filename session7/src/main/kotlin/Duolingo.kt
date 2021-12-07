open class Duolingo(val roundSize: Int = 5, val language : String) {


    val words = mutableListOf<Word>(
        EnglishWord("Hello", "Hallo"),
        EnglishWord("Today", "Vandaag"),
        EnglishWord("Food", "Voedsel"),
        EnglishWord("Triangle", "Driehoek"),
        EnglishWord("Bird", "Vogel"),
        EnglishWord("Ghost", "Spook"),
        EnglishWord("Night", "Nacht"),
        EnglishWord("Shoes", "Schoenen"),
        EnglishWord("Earth", "Aarde"),
        EnglishWord("Jail", "Gevangenis"),
        FrenchWord("Bonjour", "Hallo"),
        FrenchWord("Aujourd'hui", "Vandaag"),
        FrenchWord("Nourriture", "Voedsel"),
        FrenchWord("Triangle", "Driehoek"),
        FrenchWord("Oiseau", "Vogel"),
        FrenchWord("Fantome","Spook"),
        FrenchWord("Nuit","Nacht"),
        FrenchWord("Chaussures","Schoenen"),
        FrenchWord("Terre","Aarde"),
        FrenchWord("Prison","Gevangenis")
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





