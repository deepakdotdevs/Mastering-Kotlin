// Mutuable List -> We can modify it (add, delete etc functionality)

fun main() {
    val data = mutableListOf("Deepak", "Jangid", "Vishal", "Sumit", 100, 20, 'O')
    // and all functionaly like print using println(data[1]....[6]), using get, labmda expression all things are same as in list
    println(data)
    // let's modify it
    data[2] = "Reena Fogat" // update
    println(data) // the name is updated
    println(data.size)
    data.add(2, "My Self Deepak") // 7 is index and "My Self Deepak" is value, here we add another element in an list
    println(data)
    println(data.size)

    data.removeAt(0) // to remove an element from a list
    println(data)
    println(data.size)

    // specific data type's mutuable list

    val data2 = mutableListOf<Int>(12,100,1000)
    println(data2)

}