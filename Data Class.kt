package Concept

//A data class is a special Kotlin class used to hold data only
/*
Using data class, Kotlin gives you these for free:

toString() → for easy logging

equals() and hashCode() → for comparing objects

copy() → clone and modify with one line

Component functions → for destructuring
 */

data class DataClass(val nameData: String, val sizeData: Int)






fun main(){
    var myData = DataClass("My Data", 10)
    println(myData)
    println(myData.nameData)
    println(myData.sizeData)
    //This copy function can be used to copy an object altering some of its properties but keeping the rest unchanged
    val copy = myData.copy(sizeData = 25)
    println(copy)
    //This function returns a string representation of the object.
    val toString = myData.toString()
    println(toString)
    //The hasCode()function returns hash code for the object.
val hashCode = myData.nameData.hashCode()
    //The equals() function returns true if two objects are equal otherwise false.
    val equals = myData.equals(copy)
    println(equals)
}