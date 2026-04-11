// Set -> No Duplicates only unique elements. a group of objects with repetitions. It reflects the mathematical abstraction of set.
// Set is a collection of unique elements. Generally, the order of set elements has no significance, unordered

fun main() {
    val data = setOf("Book", "Pen", 100, 20, 'Q', "Book", 20) // there is duplicates, but not be in print output
    println(data)

    // as it is unordered, there is no indexing printing of elements we can print it using for loop
    for(dt in data) println(dt)

    // to find it's size
    println(data.size) // prints 5, as duplicates is not allowed

    // specific data type's set
    val prices = setOf<Double>(78.02, 89.2, 2.7, 0.2)
    println(prices)
}

