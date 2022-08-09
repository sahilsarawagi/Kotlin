package eu.youtube.kotlinbasic
/*
Please write a program that adds five Numbers (Double) to an arrayList
and then calculates the average of those numbers. Please use a for (in)
loop in this exercise.
 */

fun main(){
    var nummbers = arrayListOf<Double>()
    nummbers.add(55.0)
    nummbers.add(77.0)
    nummbers.add(66.0)
    nummbers.add(88.0)
    nummbers.add(58.0)
    var summ = 0.0
    for (member in nummbers){
        summ+= member
    }
    var avgg = summ/nummbers.size
    println(summ)
    println(avgg)
}