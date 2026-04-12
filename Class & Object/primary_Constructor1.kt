// there are two types of constructors :
// primary constructor : 
// when object is create at that point exactly constructor is called automatically
class Person constructor(val name:String, val age:Int) { // parameters in constructor(), if can't write val/var then it assume var and data type is compulsory
    // properties
    var gender:String = "Female"
    // member function
    fun disp() {
        println("Name = $name")
        println("Age = $age")
        println("Gender = $gender")
    }
}
fun main() {
    val o1 = Person("Somya", 21)
    o1.disp()
    println(o1.name)
    println(o1.age)
    println(o1.gender)
    val o2 = Person("Deepak", 22)
    o2.gender = "Male"
    o2.disp()
    println(o2.name)
    println(o2.age)
    println(o2.gender)
}