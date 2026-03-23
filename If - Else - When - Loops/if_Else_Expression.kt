// fun main() {
//     if(10>5) { // execute if print statement, when reverse > into < means (10<5) execute else print statement
//         println("10 is greater than 5")
//     } else {
//         println("5 is Less than 10")
//     }
// }

// fun main() {
//     val a = 20
//     val b = 10
//     var max = 0

//     if(a<b) { // (a>b) -> executer if condition, (b>a) -> executes else condition
//         println("$a is greater than $b")
//     } else {
//         println("$b is smaller than $a")
//     }
// }

fun main() {
    val a = 20;
    val b = 10
    var max = 0;
    max = if(a>b) a else b 
    println(max)
}