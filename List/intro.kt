// List -> It is an ordered collection of items. It can contain duplicate elements and it's size can be changed. It is a part of the Kotlin Collections framework. 
// use listOf() function for making list

fun main() {
    val data = listOf("Deepak", "Sahdev", "Kushagra", "Aman", 100, 200, "Deepak")
    // println(data) // it not prints it's memory locations, gives whole list in square brikets [], coz it's a list
    // // let's print using index [0][1]
    // println(data[0])
    // println(data[5])
    // println(data[6]) // also prints duplicate values
    // // print using get
    // println(data.get(4))
    // // print using for loop
    for(dt in data) { 
        println(dt)
    }
    // to print it's size of list
    println(data.size) // size is start from 1 and index is from 0 // gives 7 as output
    // how to know index no. of elements through the loop
    for(i in data.indices) {
        println(i) // 0 to 6 gives output
    }
    
    println("-------------------------------------------")
    // index and element (value) together print
    for(i in data.indices) {
        println("$i = ${data[i]}")
    }
        println("-------------------------------------------")
    // print index and values using size and range using for loop
    println("data.size")
    val s = data.size // we can do data.size-1 here instead in the next step
    for(i in 0..s-1) {
        println("$i = ${data[i]}")
    }

    // print using labma expression
    println("---------------Using Lambda Expression---------------------------------")
    data.forEach{dt -> println(dt)}

    // specific data type's list

    val data2 = listOf<String>("Deepak", "Aman", "Naman")
    println(data2)
}