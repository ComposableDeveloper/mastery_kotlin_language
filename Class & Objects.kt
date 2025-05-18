// Class: A blueprint defining properties and behaviors for objects
class Blueprint {
    // Properties: Define the data the class holds
    val name: String = "Blueprint"
    val language: String = "Kotlin"

    // Behavior: Function to display class details
    fun displayDetails() {
        println("App: $name, Language: $language")
    }

    // Init Block: Runs automatically when an object is created
    init {
        println("Blueprint initialized")
    }
}

// Main function to demonstrate objects
fun main() {
    // Object: An instance of Blueprint
    val blueprint = Blueprint()
    blueprint.displayDetails()

//Nested Class
    val nestedObj = OuterClass.NestedClass()
    nestedObj.nestedPrint()

    //Inner Class
    val outerObj = SecondOuterClass()
    val innerObj = outerObj.InnerClass()
    innerObj.innerPrint()
    outerObj.InnerClass().innerPrint()
}

//Nested Class is a class inside another class. By default, It doesn't have access to outer class's member.
class OuterClass{
    class NestedClass{
        fun nestedPrint(){
            println("Nested Class is called.")
        }
    }
}

//Inner class is a class inside another class but with the inner Keyword...
// So, that it can access outer class's member.

class SecondOuterClass{
    inner class InnerClass{
           fun innerPrint(){
            println("Inner Class is called.")
        }
    }
}