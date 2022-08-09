package eu.youtube.kotlinbasic

fun main(){
    // Creating instance of class
var intro1 =Person("Sahil", "Sarawagi")
var intro2=Person()
var intro3=Person(lastName = "Namikaze")    // here we are giving valuue to lastname only and it will take first name deafault value
var Mobile1=MobilePhone("Android","Galaxy","205")
}

class Person (firsName: String ="Sasuke", lastName: String="Uchicha"){  // this equal sign is default value we have given
    init {                                                // this init is initilizer it will initilize everytime when we call Person class
        println("Initialized a new Person object with "+
        "firstname=$firsName and lastname=$lastName")

    }
}

// Exercise part--> create a class of Mobilephone
class MobilePhone(osName: String,brand: String,model: String){
    init {
        println("Your mobile OS is $osName "+
        "Brand name of your mobile is $brand "+
        "Model is $model")

    }
}