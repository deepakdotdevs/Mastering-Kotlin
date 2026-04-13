open class Father3(_car:String, _money:Int) { // make it open coz it is inherit by Son class
    // properties
    var car:String = _car
    var money:Int = _money

    // member Function
    fun disp() {
        println("Father Car : $car")
        println("Father Money : $money")
    }
}
class Son3 : Father3 { // after inheritance we can use Father's class properties and methods in this or using this

    // properties
    var bike:String
    constructor(_car:String, _money:Int, bike:String):super(_car, _money) {
        this.bike = bike
    }
    // member function
    fun show() {
        println("Son Bike : $bike")
        println("Father Car : $car")
        println("Father Moeny : $money")

    }
}

fun main() {
    val s1 = Son3("ALT 100", 45648, "K10")
    s1.show()
    s1.disp()
    s1.car = "ZSW"
    s1.money = 45868646
    s1.bike = "K80"
    s1.show()
}