//  Arthimetic Operations -> Addition, Subtraction, Multiplication, Division etc

fun main(args: Array<String>) {
    val a = 10
    val b = 2

    println("Addition of $a and $b  = ${a+b}")
    println("Subtraction of $a and $b  = ${a-b}")
    println("Multiplication of $a and $b  = ${a*b}")
    println("Division of $a and $b  = ${a/b}")
    println("Remainder of $a and $b  = ${a%b}") // % -> mod symbol for remainder
    println("----------------------------------")

    // Also there is a Operator : 
    println(b..a) // it will use in the for loop, to print all of the nos between them
    // Example : 
    for(i in b..a) {
        println(i)
    }
}