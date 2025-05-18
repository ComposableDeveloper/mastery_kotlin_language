package Concept

//Constructor

//Primary Constructor: It declares at class header level... or you can say it parameter() for class which class don't have without a constructor.
class Builder(val project: String, val salary: Double){

    fun printProjectDetails(){
        println("Project Name: $project")
        println("Salary: $salary")
    }

}

fun main(){
    val myProject = Builder("Leaning Tower of Piza", 10000.00)
    myProject.printProjectDetails()
    Builder("Buj Khalifa", 20000.00).printProjectDetails()
    Builder("Statu of Liberty", 30000.00).printProjectDetails()
}