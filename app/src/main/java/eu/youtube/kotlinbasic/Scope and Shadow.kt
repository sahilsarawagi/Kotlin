package eu.youtube.kotlinbasic


var b=5  //bcos it is declared outside the function, It will available with in file to the all function

fun main(){

  myfunc(5) // now you can assingn value to parameter by giving argument
  b=7  // we have decalred the variable b outside the function so we can reassing the value of b within any function
  println("I am a main fun b   $b")
}

fun myfunc(a: Int){
  //  a=6       // here you cannot assign value to parameter within a function

  var a=2   // now you can assign value to 'a' becos it is variable wiht in the funciton and it has no business with parameter 'a'

  println("a is $a")  // here it will give output "a is 2" , becos we have declared the variable wiht the same name as parameter this is called shadowing

  //try to avoid shadowing bcos
  // now the thing is, we will not able to access the value of parameter or once shadowed, you can no longer access the original variable within a scope
  //your code become hard to read as two different things have the same name, which leads to confusion


  b=55  // we have decalred the variable b outside the function so we can reassing the value of b within any function
  println("I am a  myfunc b   $b")
}