// Array Constructor : 

// fun main() {
//     val roll = Array(5, {i-> i*2}) // there is two parameters, first is for size (5) and second is for function here we use lambda expression on the place of function 
//     for(rm in roll) {
//         println(rm)
//     }
// }

// Built-in-Method

fun main() {
    val roll = intArrayOf(101, 102, 103)
    for(rm in roll) {
        println(rm)
    }
    val char = charArrayOf('M', 'F')
    for(ch in char) {
        println(ch)
    }
}