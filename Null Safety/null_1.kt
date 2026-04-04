// i)

// fun main() {
//     var name:String = "Deepak" // these types of variables cannot be null 
//     // name = null; // gives error, not allowed 

//     // even if in a condition we must to do it null, then we use ? 
//     var name2:String? = "Deepak"
//     name2 = null // allowed
// }

// ii)

fun main() {
    var name1: String = "Deepak Jangid"
    val name1length = name1.length
    println(name1length)

    // var name2:String? = "Deepak Jangid"
    // name2 = null
    // val name2length = name2.length
    // println(name2length) // name2 is null completely, it gives us error
    // // but we must need to print it's output, there the 2 options to do it

    // Option 1 : We have to check null condition (Check Null in Conditions)
    // var name2:String? = "Deepak Jangid"
    // name2 = null

    // val name2length = if(name2 != null) name2.length else -1
    // println(name2length)

    // Option 2 : Safe Call (make it using the ?)
    val name3:String? = "Sahdev Sharma"
    val name3Length = name3?.length // ? means safe call means -> if not null then gives it's length, if it is null then gives null as it's length but give something atleast
    println(name3Length)

    // Option 3 : The !! Operator
    // known as "not null assertion operator (!!)" converts any value to a not null type and throws an exception if the value is null

    var name4:String? = "Vaishnavi"
     // name4 = null // throw exception
    val name4Length = name4!!.length
    println(name4Length)
}