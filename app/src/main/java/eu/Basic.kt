package eu

fun main(){
    // immutable variable
    //TODO: add new functionality
    var myName="Sahil"    // var variable can be overwritten
    val myNaam="Kakashi"  // val variable cannot be overwritten
//    myNaam="SIMSIM"     //This line will give error because myNaam is val
    myName="Sasuke"
    print("Hello "+myName)
    /* ------------------------------------------------------------------------- */

    // type string
    val myN="Hashirama"
    // type int 32 bit
    var myAge= 36

// Integer Types: Byte (8 bit),short (16 bit), int (32 bit), Long (64 bit)
    val myByte: Byte=12
    val myshort: Short=125
    val myInt: Int=123232333
    val myLong: Long=39_812_151_454_120_300
// Above we have written Byte,Short,Int,Long  (it is a data type we have defined)

//Floating Point type number : Float (32bit),Double(64bit)
    val myFloat: Float= 12.56F
    val myDouble: Double=5.45545865485458544586514845865245863524569545

// Boolean he type Boolean is used to represent logical values.
// It can have two possible value true or false
 var isSunny: Boolean=true
 isSunny=false
// Characters
val letterChar='A'
val digitChar='1'
// Strings
val mystr ="Hello world"
var firstCharInStr= mystr[0]
var lastCharInStr=mystr[mystr.length-1]
println(firstCharInStr)
println(lastCharInStr)
    println("firstcharacter "+firstCharInStr)
    println("firstcharacter $firstCharInStr")  // Above line and this line will give same output
    println("firstcharacter $firstCharInStr and length of myStr is ${mystr.length}")

//---------------------------------------------------------------------------------------------//
// Arithmetic operator
    var result =5+3
    result /= 4
    println(result)
    val a=5
    val b=3
    val c=5.0
    val division=a/b
    println(division)   // division outupt should be like 1.6666  but it is only giving 1 as a output because
                        // a and b are integer so there output will be also integer
    var resultdouble :Double= c/b
    println(resultdouble)
    //Comparison Operator
    val isEqual= 5==3
    println("isEqual is $isEqual")
    val isNotEqual= 5!=5
    println("isNotEqual is $isNotEqual")
    println("is3greater5 ${3>5}")
//--------------------------------------------------------------------------------------------//
    // Assignment Operator (+=,-=,/=,%=)
    var myNum=5
    myNum+=3    // it is same as myNum=myNum+3
    println("myNum is $myNum")

//---------------------------------------------------------------------------------------------//
    // Increment & Decrement operator (++,--)
    myNum++       // it is same as myNum=myNum+1
    println("myNum is $myNum")
    println("myNum is ${myNum++}")
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

    var heightPerson1=156
    var heightPerson2=166
    if (heightPerson1>heightPerson2){
        println("Use Raw force")
    }
    else if (heightPerson1==heightPerson2){
        println("use your power")
    }
    else{
        println("use technique")
    }
    var boy ="Sahil"
    if(boy=="Sahil"){
        println("Welcome Home Sahil")
    }else{
        println("who are you")
    }
    val isRainy=true
    if(isRainy){
        println("It's Rainyyyy")
    }
    else{
        println("Weather is clear")
    }
    //-----------------------------------------------------------------------------------------//
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 ->{
            println("Winter")
            println("Fall")
        }
        4-> println("Autumn")
        else-> println("Invalid Season")
    }
    var month = 3
    when(month){
         in 3..5-> println("Spring")    // this 3..5 is 3 to 5 (3 and 5 are included)
        in 6..8-> println("Summer")
        in 9..11-> println("Fall")
        12,1,2 -> println("Winter")
        else-> println("Invalid Season")
    }
    var ages = 22
    when (ages){
        !in 0..20 -> println("you can do anything")     // !in 0..20 (it means it is not equal to 0 to 20)
        in 18..20 -> println("you may drive now")
        16,17-> println("you may vote now")
        in 0..15 -> println("you are too young")
    }
    var x: Any =13.37f    // Here Any is data type we have assingned
    when(x) {
        is Int -> println("$x is Int")
        is Double -> println("$x is Double")
        is String -> println("$x is String")
        else -> println("$x is None of the above")
    }

    //-----------------------------------------------------------------------------------------//
    // while loop
    var s=1
    while (s<=10){
        println("The value of s is $s")
        s++
    }
    // do while loop
    do {
        println("The value of s is $s")
        s++
    }while (s<=20)

    var feltTemp="cool"
    var roomTemp=10
    while (feltTemp=="cool"){
        roomTemp++
        if (roomTemp>=25){
            feltTemp="comfy"
            println("Now the room temp is comfy")
        }
    }
    // for loops
    for (num in 1..10){
        print("$num")
    }
    println("")
    for (i in 1 until 10){    // it is same as for(i in 1.until(10))
        print("$i")
    }
    println("")
    for (i in 10 downTo 1 step 3){   //step 3 will help to jump 3 position
                                    // it is same as-- for(i in 10.downTO(1).step(2))
        print(" $i ")
    }
    // Exercise
    for (i in 1..10000){
        if (i==9001){
            println("Boom its over 9000")
        }
    }
    var humitdity="humid"
    var humitdityLevel=80
    while (humitdity=="humid"){
        humitdityLevel-=5
        if(humitdityLevel>=60){
            println("humidity decreased")
        }
        else{
            humitdity="comfy"
            println("now the environment is comfy")
        }
    }
    //------------------------------------------------------------------------//
    // Break and continue
    for(i in 1 until 20){
        print("$i")
        if(i/2==5){
            break
        }
    }
    println("  Done with the loop")
    for(i in 1 until 20){
        if(i/2==5){
            continue            // here 11/2=5.5 so we are working with int so it will skip this 11 also
        }
        println("$i")
    }
    println("  continue line from loop has been skipped")
//-------------------------------------------------------------------------------------------//
    // Functions

}