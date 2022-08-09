package eu.youtube.kotlinbasic

import java.time.temporal.TemporalAmount
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
interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}


