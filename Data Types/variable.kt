// Variable -> named a container used to store data values in a computer's memory
// Two types of variables in kotlin -> var and val

// var -> Variables that can be reassigned ->Dynamic type and Specific Type

// This is Dynamic Type of var : 

// fun main(){
//     var roll = 10; // roll is variable name and 10 (integer) value is data which is stored
//     roll = 20; // reassigning the value

//     var name = "Kotlin" // String type
//     var mobile_no = 9518800000L // Long type
//     var price = 142.82f // Float type
//     var totalCost = 147852369.452 // Double type
//     var isActive = false; // Boolean type
//     var gender = 'M' // Char type
//     var address = "123 Main St" // String type

//     // print() -> print next values in one line
//     // println() -> print next values in new line

//     println(roll)
//     println(name)
//     println(mobile_no)
//     println(price)
//     println(totalCost)
//     println(isActive)
//     println(gender)
//     println(address)

//     // reassign
//     gender = 'F'
//     println(gender)

// }

// val -> Variables that cannot be reassigned -> Dynamic Type and Specific Type
// This is Dynamic Type of val :

fun main() {
    val roll= 10
    val name = "Kotlin"
    val mobile_no= 9518800000L
    val price= 142.82f
    val totalCost = 147852369.452
    val isActive = false
    val gender = 'M'
    val address= "123 Main St"

    println(roll)
    println(name)
    println(mobile_no)
    println(price)
    println(totalCost)
    println(isActive)
    println(gender)
    println(address)

    // reassign
    // roll = 20
    // name = "Kotlin Updated"
    // mobile_no = 1234567890L
    // price = 150.0f
    // totalCost = 150000000.0
    // isActive = true
    // gender = 'F'
    // address = "456 Main St"

    // println(roll)
    // println(name)
    // println(mobile_no)
    // println(price)
    // println(totalCost)
    // println(isActive)
    // println(gender)
    // println(address)
}