package eu.youtube.kotlinbasic

fun main(){
//    val numbers: IntArray= intArrayOf(5,6,9,6,7)
//    val numbers= intArrayOf(5,6,8,9)
    val numbers= arrayOf(5,9,2,3)  //  line 4 ,5 and 6 will work same
    println(numbers.contentToString())
    for (element in numbers){
        println(element)
        println(" I am +2 list ${element+2}")
    }
    println("I am the first number in an array ${numbers[0]}")
    numbers[0]=6  // overwritting the array member
    println("I am the first number in an array ${numbers[0]}")
    val numbersD: DoubleArray= doubleArrayOf(1.0,2.0,3.0,4.0)  // array of decimal numbers
    println(numbersD.contentToString())

    val days = arrayOf("Sun","Mon","Tue","Wed","Thu")   // Array of string
    println(days.contentToString())
    val Fal = arrayOf(Fruit("apple",250.0), Fruit("orange",300.0))
    println(Fal.contentToString())
    println(Fal[0])
    for (index in Fal.indices){
        println("${Fal[index].name} is in index $index")
    }
    for(mem in Fal){
        println(" ${mem.name} ")
    }
    val mix= arrayOf("ss",55.0,8,Fruit("Grape",600.0)) // Array of different type
    println(mix.contentToString())
    println(Fal[1].price)
}

data class Fruit(val name: String,val price: Double)