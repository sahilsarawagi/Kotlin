package eu.youtube.kotlinbasic

fun main(){

    val frutis = setOf("Orange","Apple","Grape","Apple")
    println(frutis.size)  //  it will give output as 3 , where as frutis has 4 members
                          // this is why bcos set ignore the same item
    println(frutis)
    println(frutis.toSortedSet())
    val newfrutis=frutis.toMutableList()
    // now bcos newfrutis is mutable we can add and remove item from this
    newfrutis.add("Water Melon")
    newfrutis.add("Peer")
    newfrutis.add("Apple")
    println(newfrutis)
    println(newfrutis.elementAt(5))

    // Map is a type of collection that holds data in the form of key vlaue pair

    val daysoftheWeek= mapOf(1 to "Monday",77 to "Tuesday",3 to "Wednesday")
    println(daysoftheWeek[77])  // here 77 is not index its the actual key value that we have given in line 20

    for (key in daysoftheWeek.keys){
        println("$key is to ${daysoftheWeek[key]}")
    }
    val fruitMap= mapOf("Fav" to Fruit("papaya",55.0),"Good" to Fruit("Strawberry",99.0))
    // this fruit data class is from array file

    val newlyDayWeek=daysoftheWeek.toMutableMap()
    newlyDayWeek[105]= "Thursday"   // here 105 is key value we have given

    println(newlyDayWeek.toSortedMap())  // it is sorted by its key

}