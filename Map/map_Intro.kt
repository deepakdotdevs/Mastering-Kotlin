// map is also known as dictionary is a set of key-value pairs. Keys are unique and each of them maps to exactly one value.
// the values can be duplicates. Maps are useful for storing logical connections between objects, for example, an employee's ID
// and their position.

fun main() {
    // how to create map mapOf(key to value) 
    val data = mapOf(1 to "Sonam", "key2" to "Sumit", "key3" to "Deepak", "key4" to 100)  // there is 1 is key and other one sonam is value value is type of any data type and key is also of be any data type
    // // to print it
    // println(data)
    // // one by one access
    // println(data[1]) // we need to give key as an index
    // println(data["key4"])
    // // we can use get to print
    // println(data.get(1))

    // // to access all of the keys only of map 
    // println(data.keys)
    // // to values only
    // println(data.values)

    // println("All Keys : ${data.keys}")

    // // use for loop for keys print one by one
    // for(keys in data.keys) {
    //     println(keys)
    // }

    // // same for values
    // println("All Values : ${data.values}")
    // for(values in data.values) {
    //     println(values)
    // }

    // // too access both keys and values
    // for(keys in data.keys) {
    //     println("$keys = ${data[keys]}")
    // }

    // // prints it's size (size is on pairs not count every pair nos also)
    // println(data.size)


    // specific data type
    val data2= mapOf<String, String>("key1" to "val1", "key2" to "val2", "key3" to "key4")
    println(data2)
}