// Where you need to create a class Solely To hold data

data class Employe(val name:String, val age:Int) 

fun main() {
    val emp = Employe("Deepak", 21)
    println(emp.name)

    println("Name: ${emp.name}")
    println("Age: ${emp.age}")
    println(emp)

    // if you want String representation of the object, use this
    println(emp.toString())

    // deconstructing
    val(name, age) = emp
    println("Name = $name")
    println("Age = $age")
}