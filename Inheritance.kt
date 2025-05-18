package Concept

//Inheritance: The process where one class acquire the properties and behaviors of another class.
//An open keyword is used to make a class inheritable.
//By default, Kotlin classes are final and cannot be inherited.

// Superclass: A blueprint that can be inherited using 'open'
open class Person(val name: String) {
    // Open method to allow overriding in subclasses
    open fun introduce() {
        println("Hi, I'm $name")
    }
}

// Subclass: Inherits from Person, adding new properties and overriding behavior
class Student(name: String, val studentId: Int) : Person(name) {
    override fun introduce() {
        println("I'm $name, Student ID: $studentId")
    }
}

fun main() {
    // Create an instance of the subclass
    val student = Student("Alice",302415 )
    student.introduce() // Output: I'm Alice, Student ID: 12345
}