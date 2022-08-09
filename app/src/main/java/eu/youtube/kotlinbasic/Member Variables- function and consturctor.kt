package eu.youtube.kotlinbasic

import javax.crypto.KeyAgreementSpi

fun main(){
    var Tobirama= Employee("Tobirama","Senju")
    Tobirama.hobby="killling Uchiha"
    Tobirama.statehobby()
    var Kakashi=Employee("Kakashi","Hatake",13)
    Kakashi.hobby="killing Rin"
    Kakashi.statehobby()
    Kakashi.age=30   // you can also overwrite
    println("Kakashi age after overwrite is ${Kakashi.age}")

}

class Employee(firstname: String="Minato", lastname: String="Namikaze"){
    //Member variable or properties
    var age: Int?=null // we have assinged age as a null bcos it is possible that some people not provide their age data so
                          // we want to run our app wihtout any error
    var hobby: String="I love to watch Netflix"  // This is the dafault value of hobby
    var firstname: String?=null

    init {
        this.firstname=firstname
        println("firstname of the employee is $firstname "+
                "lastname of the employee is $lastname")
    }
    //Member Secondary constructor
    constructor(firstname: String,lastname: String,age: Int): this(firstname, lastname){
        this.age=age  // what we are saying by using "this" is that the age given to the constructor will assign to
                      // the "this.age" means the age that is in this class
        println("firstname of the employee is $firstname "+
                "lastname of the employee is $lastname " + "And the age is $age")


    }

    // Member function or Methods
    fun statehobby(){
        println("$firstname\'s hobby is $hobby")
    }


}