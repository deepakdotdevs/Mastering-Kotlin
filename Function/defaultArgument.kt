fun main() {
    val sum = add(20,80)
    println(sum)
    val sum_1 = add(80);
    println(sum_1)
}
fun add(x: Int, y:Int=50):String {
    return ("Addition is => ${x+y}")
}