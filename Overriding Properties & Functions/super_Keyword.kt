open class Father5 { // make it open coz it is inherit by Son class
    // properties
    open var car:String = "Thar AT17"
    var money:Int = 1000

    // member Function
    open fun disp() {
        println("Father Car : $car")
        println("Father Money : $money")
    }
}
class Son5 : Father5() { // after inheritance we can use Father's class properties and methods in this or using this

    // properties
    var bike:String = "Hunter 350"
    override var car:String = "BMW"
    var fcar:String = super.car

    // member function
    fun show() {
        println("Son Bike : $bike")
        println("Son Car : $car")
        println("Father Car : $fcar")
        println("Father Moeny : $money")
    }

    override fun disp() {
        println("Son class Disp")
    }
}

fun main() {

    val s1 = Son5()
    s1.show()
    s1.disp()

    val f1 = Father5()
    f1.disp()

}