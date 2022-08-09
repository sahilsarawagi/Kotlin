package eu.youtube.kotlinbasic

data class User(val id: Long, var name: String)

fun main(){
    val user1=User(1,"Sasuke")
//    val name=user1.name
//    println(name)
    println(user1.name)
    user1.name="Naruto"
    val user2=User(1,"Naruto")

    println(user1==user2)  // we could also write instead of this println(user1.equals(user2))

    println("User Details: $user1")
    val updatedUser= user1.copy(name="Kakashi Hatake")
    println(user1)
    println(updatedUser)
    println(updatedUser.component1())  // will print 1
    println(updatedUser.component2())  // will print kakashi Hatake

    val (id,name)=updatedUser  // It is same as val id= updatedUser.id and
                                // val name= updatedUser.name
    println("id=$id,name=$name")
}