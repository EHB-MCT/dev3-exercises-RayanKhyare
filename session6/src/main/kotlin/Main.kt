import java.sql.*
import java.util.*

fun main(){
    // Create a driver: the library/class that will create the connection
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()

    // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.user
    connectionProps["password"] = credentials.password

// Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)

    println("Which City are you going to ?")
    val userAnswer = readLine()

    val statement = connection.prepareStatement("SELECT * FROM rides WHERE destination_city = '$userAnswer' ORDER BY departure_time ASC LIMIT 1")
    val result = statement.executeQuery()

 while (result.next()){
    var id = result.getInt   ("id")
     var train = result.getString       ("train")
     var departure_time = result.getString( "departure_time")
     var departure_city = result.getString( "departure_city")
     var destination_city= result.getString( "destination_city")

     println("The next train to $userAnswer is at $departure_time. The ride begins in $departure_city and ends in $destination_city");

 }


}


