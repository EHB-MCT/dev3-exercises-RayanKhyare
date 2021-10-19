class Student(override val name : String): Person(name) {

    fun gossip(){
        println("Student test")
    }
    override fun talk(){
        gossip()
    }


}