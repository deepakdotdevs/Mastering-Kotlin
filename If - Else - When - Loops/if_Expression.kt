// i)

// fun main() {
//     // if(10>5) { // return or output is shown, coz condition is true
//     //     println("10 is Greater than 5")
//     // }

//     if(10<5) { // Give no output, coz condition is not true
//         println("10 is Greater than 5")
//     }
// }

// ii)

fun main() {
    val a = 20;
    val b = 10
    var max = 0; // because it's value is will be assign in next steps
    if(a>b) max = a
    println("Then, Updated Max Value is = $max")

    if(b>a) { // not execute, coz b is less than a (b<a)
        println("B is Max value = $b")
    }
    
}