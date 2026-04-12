fun main() {
    val data = mutableMapOf(1 to "val1", "key2" to "val2", "key3" to 385)
    // println(data)
    // println(data[1])
    // println(data["key3"])
    // println(data.get("key2"))
    // for(key in data.keys) {
    //     println("$key = ${data[key]}")
    // }
    // println(data.size) // gives size -> 3

    // functionalities in mutable map
    // we can update, add and remove also, we can do it in both with specific data type's mutable map

    val names = mutableMapOf<String, String>("key1" to "Deepak", "key2" to "Pankaj", "key3" to "Aman", "key4" to "etc")
    println(names)

    names["key2"] = "NoteBook"// update
    println(names)

    // adding
    names["key5"] = "Hunter 350"
    println(names)

    // update method 2, using put()
    names.put("key1", "Royal Enfield")
    println(names)

    // to remove
    names.remove("key3")   
    println(names)

    // method 2 to remove
    names.keys.remove("key5")
    println(names)

    // remove on the based on values not keys
    names.values.remove("NoteBook")
    println(names)
}