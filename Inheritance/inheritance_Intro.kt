open class Father { // make it open coz it is inherit by Son class
    // properties
    var car:String = "Thar AT17"
    var money:Int = 1000

    // member Function
    fun disp() {
        println("Father Car : $car")
        println("Father Money : $money")
    }
}
class Son : Father() { // after inheritance we can use Father's class properties and methods in this or using this

    // properties
    var bike:String = "Hunter 350"

    // member function
    fun show() {
        println("Son Bike : $bike")
        println("Father Car : $car")
        println("Father Moeny : $money")

    }
}
class Daughter: Father() {
    // properties
    var bike:String = "KTM 350"

    // members
    fun show() {
        println("Daughter Bike : $bike")
        println("Daughter Car : $car")
        println("Daughter Moeny : $money")

    }
}
fun main() {
    val f1 = Father()
    f1.disp()

    val s1 = Son()
    s1.show()
    // (s1.disp()) i want s1 calls father methods, so here we use and that's why we use inheritance
    s1.disp()

    // let's reassign car from father using son s1 object
    s1.car = "Mercedes"
    s1.money = 500000
    s1.bike = "Hunter 350 Classic"
    s1.show()
    s1.disp()

    // object for daughter
    val d1 = Daughter()
    d1.show()
    d1.disp()
}