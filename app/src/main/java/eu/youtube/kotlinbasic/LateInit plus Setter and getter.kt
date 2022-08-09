package eu.youtube.kotlinbasic

fun main(){
    var mycar= Car()
    mycar.owner
    println(mycar.owner)
    println("myBrand is ${mycar.myBrand}")
    mycar.maxSpeed=240
    println("MaxSpeed is ${mycar.maxSpeed}")
//    mycar.Mymodel="audi"     // this will give error
    println(mycar.Mymodel)

}

class Car(){
    lateinit var owner: String // when we use lateinit then we are saying that we will initilize variable later on
                                // if we don't use lateinit then we have to give some default value to variable
   val myBrand : String="BMW"
    get() {             //custom getter
        return field.toLowerCase()
    }
    var maxSpeed: Int=240
    get() = field
    set(value) {
        field= if (value>0) value else throw IllegalArgumentException("Max speed can not be less than zero")
    }
    var Mymodel:String="Ms"
        private set         // we have set Mymodel private, now we arenot able to change value outside the class
    init {
        this.Mymodel="M4"
        this.owner= "Sakura"
    }

}