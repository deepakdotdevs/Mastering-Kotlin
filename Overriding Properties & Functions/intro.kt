open class Father4 { // make it open coz it is inherit by Son class
    // properties
    open var car:String = "Thar AT17"
    var money:Int = 1000

    // member Function
    open fun disp() {
        println("Father Car : $car")
        println("Father Money : $money")
    }
}
class Son4 : Father4() { // after inheritance we can use Father's class properties and methods in this or using this

    // properties
    var bike:String = "Hunter 350"
    override var car:String = "BMW"
    

    // member function
    fun show() {
        println("Son Bike : $bike")
        println("Father Car : $car")
        println("Father Moeny : $money")
    }

    override fun disp() {
        println("Son class Disp")
    }
}

fun main() {

    val s1 = Son4()
    s1.show()
    s1.disp()

    val f1 = Father4()
    f1.disp()

}