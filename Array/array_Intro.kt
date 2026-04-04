// creations of array -> use arrayOf()
// In kotlin we can store different different types of data types values in an array, but in others only one data type can be stored
// indexing is starts from 0 to n

// i) 

// fun main() {
//     val data = arrayOf<Any>("Deepak", "Aman", "Sahdev Sharma", "Kushagra", 100, 785420, 'A', 'z')
//     println(data) // prints it's memory location, not values

//     val data2 = arrayOf<String>("Deepak", "Google")

//     // how to print data or values of array, using the index nos or loops

//     println(data[0])
//     println(data[1])
//     println(data[4])
//     println(data[7])


//     // using for loop
//     for(item in data2) { // item is a variable we can change it
//         println(item)
//     }
// }

// ii) 

// fun main() {
//     val data  = arrayOf<String>("Deepak", "Aman", "Naman", "Krishna", "Shaurya")
//     // print before update
//     for(item in data) {
//         println(item)
//     }

//     // i) 1st Method to update : 
//     // // update it and print
//     // data[1]  = "Sahdev Sharma"
//     // // print after update
//     // for(item in data) {
//     //     println(item)
//     // }

//     // ii)
//     // data.set(1, "Kushagra") // there is 2 parameters, 1 is index we have to make change, and second is what we need to make change
//     // // let's print it
//     // for(item in data) {
//     //     println(item)
//     // }

//     // iii) first method to get 
//     val nm = data[0]
//     println(nm)

//     // iv) second method to get
//     val nm1 = data.get(0)
//     println(nm1)

//     // we can increase it's size like
//     // in present array size (total indexes are 4)
//     data[5] = "Aaloo" // gives error coz we can't increase it's size 
//     for(item in data) {
//         println(item)
//     }
// }

// iii) Loop Array in their indexes

fun main() {
    val names = arrayOf<String>("Deepak", "Aman", "Nitin")
    
    // a) 
    for(name in names) {
        println(name)
    }

    // b) .indices gives index nos
    for(i in names.indices) {
        println(i)
    }

    // c) we want index nos + element
    for(i in names.indices) {
        println("$i = ${names[i]}")
    }

    // d) to print array's size
    println(names.size)
    // print array using .size
    for(i in 0..names.size-1) {
        println("$i = ${names[i]}")
    }

    // using for-each loop
    names.forEach{name -> println(name)}
}