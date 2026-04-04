// creations of array -> use arrayOf()
// In kotlin we can store different different types of data types values in an array, but in others only one data type can be stored
// indexing is starts from 0 to n

fun main() {
    val data = arrayOf<Any>("Deepak", "Aman", "Sahdev Sharma", "Kushagra", 100, 785420, 'A', 'z')
    println(data) // prints it's memory location, not values

    val data2 = arrayOf<String>("Deepak", "Google")

    // how to print data or values of array, using the index nos or loops

    println(data[0])
    println(data[1])
    println(data[4])
    println(data[7])

}