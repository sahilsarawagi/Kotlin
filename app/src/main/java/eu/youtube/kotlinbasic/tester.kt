package eu.youtube.kotlinbasic

import java.text.SimpleDateFormat
import java.util.*

fun main(){
    var mycal= Calendar.getInstance()
    println(mycal)
    var year = mycal.get(Calendar.YEAR)
    println(year)
    val selectedDate = "${5}/${2}/${2021}"
    println(selectedDate)
    val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
    println(sdf)
    val theDate= sdf.parse(selectedDate)
    println(theDate)

    val selectedDateInMinutes = theDate.time/60000
    println(selectedDateInMinutes)
    val currentDate=sdf.parse((sdf.format(System.currentTimeMillis())))
    println(currentDate)
    val currentDateInMinutes= currentDate.time/60000
    println(currentDateInMinutes)
    val diffenceInMinutes = currentDateInMinutes - selectedDateInMinutes
    println(diffenceInMinutes)
//    theDate?.let {
//        currentDate?.let {




}