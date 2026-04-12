class Mobile{ // after class, first letter is always capital as it's a class name
    // properties (same as variable) :-
    var model:String = "100K"
    var price:Float = 8759.42F

    // member function or methods (same as functions)
    fun disp() {
        println("Model = $model")
        println("Price = $price")
    }
}
// In main function we make a object of class and call it

fun main() {
    // let's make it object
    val obj1 = Mobile() // obj1 is object name // Creating object
    obj1.disp() // Calling function member using object
    // let's give it new values
    obj1.model = "Hunter AK1788" // Accessing properties using object
    obj1.price= 8765487.45f // Accessing properties using object
    obj1.disp() // Calling function member using object

    var iPhone = Mobile()
    iPhone.model = "iphone 20" // Accessing properties using object
    iPhone.price = 12.02f // Accessing properties using object
    iPhone.disp() // Calling function member using object 
}