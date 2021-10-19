class Comedian(override val name : String): Person(name) {
    fun tellJoke(){
        println("Comedian test")
    }
   override fun talk(){
        tellJoke()
    }

}