// i)

fun main() {
    val str = "Kotlin"
    println(str)
    println("This language we study about is "+ str)
    println("This language is $str") // This Point 

    val cart = 10
    println("Cart is equals to $cart") // This Point

    val a = "Hiiii"
    val b = "Guyss"
    println("$a $b")
    println("---> $a and $b")

    val c = 2
    val d = 3
    println("Addition of c and d = $c + $d") // gives no optimized answer
    println("Addition of c and d  ${c+d}") // for this we have to use curly brackets {}
    println("Addition is equals to : ${c+d+50}")

    val name = "deepak"
    println("My name is $name.")
    println("My name is ${name.uppercase()}")
}