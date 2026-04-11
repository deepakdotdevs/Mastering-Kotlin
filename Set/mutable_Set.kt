// update is not possible coz of no indexing, but we can add elements
// there is also specific data type's mutable set

fun main() {
    val data = mutableSetOf("Poco C65", "Hindi", "English", "Pankaj", 39, 'O')
    println(data)
    for(np in data) {
        println(np)
    }
    
    // add in this set
    data.add("Kunal")
    println(data)

    // remove from this set
    data.remove("Poco C65")
    println(data)

    // specific data type mutable set 
    val sub = mutableSetOf<String>("Hindi", "English", "Math", "Urdu")
    println(sub)

}