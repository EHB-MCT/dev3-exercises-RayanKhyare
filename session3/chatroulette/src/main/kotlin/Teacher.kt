class Teacher (override val name : String): Person(name){
    fun funFact(){
        println("Teacher test")
    }
    override fun talk(){
        funFact()
    }


}