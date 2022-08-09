package eu.youtube.kotlinbasic

fun main(){
    myFunction()
    // here 5 and 4 are the argument
    println("The sum is ${addUP(5,4)}")
    var c= average(4.5,5.0)
    println("The avg of two number is $c")
//-------------------------------------------------------------//
      //NULL
    var name: String ="Sahil"
    name= "Sasuke"
    //name=null  // compilation error
    var nullableName: String? = "Kakashi"
   //nullableName=null

    var len=name.length
//  var len2=nullableName.length //compilation error
    var len2=nullableName?.length
    if(nullableName!=null){    // this is old fashion method it is same as line 19
        var len2=nullableName.length
    }else{
        null
    }
//    println(nullableName?.toLowerCase())
//    nullableName?.let { println(it.length) }   //same as line 19

    //---------------------------------------------------/-/---------//
    // Elvis operator
    // :? is the Elvis operator
    val nameing = nullableName ?: "Guest"  // nullableName  is null then by defult nullableName will assing "Guest" as a default to naming  (uncomment the line 15)
    println("naming is $nameing")
    var p=nullableName!!.toLowerCase()
    println("naming is $p")
    // You can perform a chain safe calls:
    // val wifesAge: String? = user?.wife?.age ?: 0

}
// Method - a Method is a Function within a class
// here a and b are the parameter(input)
fun addUP(a: Int,b: Int): Int{    // a is Int , b is Int we defined and (a: Int,b: Int): Int <-- this int is (we want return value in Int)
    var c=a+b
    return c
}
fun average(a:Double,b:Double):Double{
    var k=(a+b)/2
    return k
}

fun myFunction(){
    println("Called from my Function")
}