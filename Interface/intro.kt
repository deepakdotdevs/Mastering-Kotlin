// we can't make the object of interface class

interface Father8 {
    // properties // we can initialise properties in interface class coz it is by default is abstract class 
    var car:String // this is can't be initialise here only mentioned

    // member function
    fun disp() {
        println("Father Car : $car")
    }

    // this method is by default abstract class, coz it have no body
    fun hello()
}
class Son8:Father8 {
    // own properteis + parent class
    var bike:String = "Hunter 350"

    // implementaion father's abstract property
    override var car:String = "Thar" // also mention override mandiantory

    // own member function
    fun show() {
        println("son's member function")
    }
    // implement father's abstract method also
    override fun hello() {
        println("Father's Abstract Method Hello")
    }
}
fun main() {
    val s1 = Son8();
    s1.show();
    s1.disp();
    s1.hello()
}