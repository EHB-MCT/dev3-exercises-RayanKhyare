open class Person(open val name : String) {

    fun introduce(){
      return println("Hey , my name is $name.")
    }

    open fun talk(){}
}