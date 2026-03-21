// Logical Operators : Logical AND (&&), Logical OR (||) and Logical !

// && -> All conditions must be TRUE, then returns true
// || -> If there is even one TRUE is present, then returns TRUE
// ! - > represent not

fun main() {
    val a = 30
    val b = 20
    val c = 10

    // Logical AND &&
    println((a>b) && (b<a)) // returns true
    println((a>b) && (b>a)) // returns false

    // Logical OR ||
    println((c<b) || (a>b)) // returns true
    println((b>c) || (a<b)) // returns true
    println((a<b) || (c>b)) // returns false

    // Logical NOT !
    println(!(a>b)) // return false
    println(!(a<b)) // return true
}