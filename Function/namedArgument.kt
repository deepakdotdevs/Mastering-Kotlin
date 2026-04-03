// named argument function means in before function, first value = first parameter and same for second.
// but we want first value = second parameter and second value = first parameter

// i)

// fun main() {
//     val total = add(50, 30)
//     println(total)
// }
// fun add(x:Int, y: Int): Int {
//     println("X = $x") // gives 50
//     println("Y = $y") // gives 30
//     return (x+y) // gives 80
// }

// => 

// fun main() {
//     val total = add(y=50, x = 30)
//     println(total)
// }
// fun add(x: Int, y:Int):Int {
//     println("X = $x")
//     println("Y = $y")
//     return (x+y)
// }