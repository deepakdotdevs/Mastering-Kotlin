open class Father2 { // make it open coz it is inherit by Son class
    // properties
    var car:String
    var money:Int

    // secondary constructor
    constructor(car:String, money:Int) {
        this.car = car
        this.money = money
    }
    // member Function
    fun disp() {
        println("Father Car : $car")
        println("Father Money : $money")
    }
}
class Son2 : Father2 { // after inheritance we can use Father's class properties and methods in this or using this

    // properties
    var bike:String
    constructor(car:String, money:Int, bike:String):super(car,money) {
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
    val s1 = Son2("ALT 100", 45648, "K10")
    s1.show()
    s1.disp()
    s1.car = "ZSW"
    s1.money = 45868646
    s1.bike = "K80"
    s1.show()
}