// If any function return any other function or if any function is exist in the parameter then it known as the Higher Order Function

fun main() {
    hOF(10, 20, ::add)
}
fun add(a:Int, b:Int):Int {
    return a+b
}
fun hOF(a:Int, b:Int, callback:(Int, Int) -> Int) {
    println(callback(a,b))
}