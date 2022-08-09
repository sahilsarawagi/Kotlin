package eu.youtube.kotlinbasic


fun main(){
val mobile=Mobilephone("Android","galaxy5","Samsung")
mobile.battery=55
mobile.battery()
mobile.chargeBattery()

}

class Mobilephone(osName:String,brand:String,Model:String){
    var battery:Int=30
    init {
        println("The phone $Model from $brand uses $osName as its Operating System")
    }
    fun battery(){
        println("The battery is left is $battery")
    }
    fun chargeBattery(){
        println("It has a battery $battery")
        println("battery has been charged by 30")
        println("Now it has battery ${battery+30}")
    }

}

//
//Add a member to it, which indicates how much battery is left (call it "battery". Initialize this value with a number between 0 and 50.
//
//Then add a function
//"chargeBattery"
//Which needs details about how much was charged.
//
//It should print out how much battery the phone had before, how much was charged and how much it has now.
//Create an Object of the class and call this function. Charge the battery by 30.