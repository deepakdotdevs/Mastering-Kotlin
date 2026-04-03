// Ways of Lambda Expression : 

// a) 

// fun main() {
//     // {a:Int, b:Int -> a+b } // it is a type of an function -> a+b this is the body and remaining is the arguments
//     // Let's make it
//     val add= {a:Int, b:Int -> a+b}
//     // ways to print it : 
//     // i)
//     val total = add(10,20)
//     println(total)

//     // ii)
//     println(add(10,50))
// }

// b) 

// fun main() {
//     val sum:(Int, Int) -> Int = {a,b -> a+b} // sum is the function name, Int & Int is type of the parameters, -> Int this is the return type, a,b is parameters and we have to do a+b
//     // let's call it
//     println(sum(50,70))
// }

// c) Lambda Expression in Higher Order Expression 

fun main() {
    hOF(10, 20, {a,b -> a+b}) // inside
    hOF(20,80) {a,b -> a+b} // outside
}
// fun add(a:Int, b:Int):Int { // on the place of this function we use lambda expression in main function 
//     return a+b
// }
fun hOF(a:Int, b:Int, callback:(Int, Int) -> Int) {
    println(callback(a,b))
}