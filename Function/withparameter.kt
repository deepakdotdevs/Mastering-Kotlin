// parameter under paranthesis

//i) parameter, data type and it's calling

// fun main() {
//     disp(10, 20)
//     println("After function")
// }

// fun disp(x: Int, y:Int) {
//     println("Values are the $x and $y")
// }  

// ii) create function add with parameters and return type of it

fun main() {
    val total = add(10, 20)
    val total_1 = add(20, 30) // in this way we can call same function for different parameters or values

    println(total)
    println(total_1)

    val mult = multi(2,3)
    println(mult)
}
fun add(x:Int, y:Int) : Int {
    val a = x
    val b = y
    return (a+b)
}
fun multi(x:Int, y:Int): String {
    return ("Multiplication of x and y = ${x*y}") // we use the direct value of x and y we input in main()
}