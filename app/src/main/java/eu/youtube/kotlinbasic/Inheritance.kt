package eu.youtube.kotlinbasic

import java.time.temporal.TemporalAmount
// the class that inherits the feature of other
// class is called the sub class or child class or
// Derived class, and the class whose features are
// inherited is called the Super class or Parent class
// or Base class
fun main(){
    var mycaar=Cars("A3","Audi")
    var myEcar=ElectricCar("a7","Tesla",85.0)
    myEcar.chargerType="type 2"
    myEcar.extendRange(200.0)
    myEcar.drive()

    //Polymorphism
    mycaar.drive(200.0)
    myEcar.drive(200.0)



}

// Super class, Parent class or Base Class
open class Vehicle{   // all class in Kotlin are non inheritable by default so to make it inheritable we should make it open
    //properties
    // methods

}
// sub class,child class or Derived class  of the vehicle class
open class Cars(val name:String,val brand: String): Vehicle(){  // if we use sealed instead of open then we will not allowed to inherit that class
    open var range: Double=0.0
    fun extendRange(amount: Double){
        if (amount>0)
            range+=amount
    }
    open fun drive(distance: Double){
        println("Drove for $distance km")
    }
}

class ElectricCar(name: String, brand: String,batteryLife:Double)
    : Cars(name, brand){
    var chargerType="type 1"
    override var range= batteryLife* 6           // first you have to open range in super class then you
    override fun drive(distance: Double) {
        println("Drove for $distance Km on electricity")
    }
    fun drive(){
        println("Drove for $range Km on electricity")
    }
    }