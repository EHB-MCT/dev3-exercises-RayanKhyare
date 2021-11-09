class Chatbot(): Chatpartner{

  override fun introduce(){
        return println("Hey , I'm a bot. Cool huh ?")
    }

  override fun talk(){
       introduce()
    }

}
