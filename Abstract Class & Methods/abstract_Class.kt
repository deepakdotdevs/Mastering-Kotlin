// abstract class ka object create nahi hota
// we can make abstract methods or functions in the abstract class

abstract class Father7 { // if we use abstract keyword then it will an abstract class and it is by default open, so we can't need to mention open keyword for inheritance
    // properties
    var car:String = "Thar 498"

    // member function
    fun disp() {
        println("Father's Car : $car")
    }

    // abstract method/function : 
    abstract fun hello() //no body, it's body is created which class is inherited it as Son7 class's present's it's body 
}
class Son7:Father7() { // if we can't make hello() abstract method body in inherited class, then it gives us error, means choose one thing from, make class abstract or second is initialise body of the abstract method or function

    fun show() {
        println("Father car : $car")
    }

    // implementation of Father's abstract method
    override fun hello() {
        println("Father's Abstract Method Hello")
    }
}

fun main() {
    val s1 = Son7();
    s1.show();
    s1.disp();
    s1.hello();

    // val f1 = Father7() // we can't do this coz of abstract class has no object
    // f1.disp()
}