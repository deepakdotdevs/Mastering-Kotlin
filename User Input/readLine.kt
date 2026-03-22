fun main() {
    println("Name - ")
    val name = readLine() // readLine() only takes Strings
    println(name)

    // How to define only enter to String or any specific data type
    println("Your Name = ")
    val Name: String? = readLine()
    println(Name)

    // To check data type 
    println(name!!::class.simpleName) // -> we studied about {!!} & {?} in null safety topic
}
