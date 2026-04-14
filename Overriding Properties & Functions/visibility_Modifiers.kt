/* *
* private means visible inside this class only (including all its
members).
* protected is the same as private but is also visible in subclasses.
* internal means that any client inside this module who sees the
adeclaring class sees its internal members.
* public means that any client who sees the declaring class sees its public members. * */


// All are Public in this case

open class Father6 {
    // properties
    var a:Int = 10
    var b:Int = 20
    var c:Int = 30
    var d:Int = 40

    // member function
    fun disp() {
        println("A: $a")
        println("B: $b")
        println("C: $c")
        println("D: $d")
    }

    // other member function
    fun hello() {
        println("Hello Father")
    }
}
class Son6 : Father6() {
    // property
    var bike:String = "Hunter 350"

    // member function 
    fun show() {
        println("A: $a")
        println("B: $b")
        println("C: $c")
        println("D: $d")
        hello()
    }
}
fun main() {
    val s1 = Son6()
    s1.show()
    s1.disp()
    s1.a = 101
    s1.b = 201
    s1.c = 301
    s1.d = 401
    s1.show()
    s1.hello()

}