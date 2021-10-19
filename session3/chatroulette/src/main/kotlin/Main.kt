fun main(){

    val persons = arrayOf(Person("Rayan"),Person("Sasha"))
    val jobs = arrayOf(Student("Achraf"),Teacher("Ben"),Comedian("Zemmour"))

  println(jobs.random().introduce())
    println(jobs.random().talk())

}