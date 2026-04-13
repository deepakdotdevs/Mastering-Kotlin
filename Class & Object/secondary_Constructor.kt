// Secondary Constructor

class People {
    // properties
    var name:String // same varable as in constructor
    var hAge:Int // differ variable from constructor
    var gender:String = "Male"
    // secondary constructor
    constructor(name:String, age:Int) { // here we use constructor keyword compulsory
    println("Constructor called")
    this.name = name // we use this.name by which kotlin understand that name is property and other one is from constructor parameter
    hAge = age
    }

    // member function
    fun disp() {
        println("Name = $name")
        println("Age = $hAge")
        println("Gender = $gender")
    }
}
fun main() {
    val p1 = People("Deepak", 21)
    p1.disp()
    println(p1.name)
    println(p1.hAge)
    println(p1.gender)
}