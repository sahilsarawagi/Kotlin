package eu.youtube.kotlinbasic

fun main(){
    val months= listOf("jan","feb","mar")
    val anyTypes= listOf("bli",1,2,3.0,true)
    println(anyTypes.size)
    println(months[1])
    println("-------------------")
    for (mon in months){
        println(mon)
    }
    // We can not add item in list
    // if we want to add item in list we will have to make it muttable

    val additionalMonths= months.toMutableList()
    additionalMonths.add(3, "22") //you can add item on any index

    val newMonths= arrayOf("april","May","June")
    additionalMonths.addAll(newMonths)  // you can add array also
    additionalMonths.add("July")  // you can add wihtout using index
    println(additionalMonths)

    val days= mutableListOf<String>("mon","tue","wed")  // you can make mutable list of type
    days.add("thur")
    println(days)
    days[2]="Sun"  // this will overwrite the content at index 2
    days.removeAt(1)  // this will remove the item at index 1
    println(days)
    val removelist = mutableListOf<String>("Sun","thur")
    days.removeAll(removelist)   // this will remove all the item from days which are in removelist
    println(days)
    days.removeAll(days) // this will remove all the things in the days  list
    println(days)
}