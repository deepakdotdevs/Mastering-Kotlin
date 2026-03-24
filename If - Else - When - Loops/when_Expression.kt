// // i) 

// fun main() {
//     val x =3 // when x is except 1,2,3 then else is work 
//     when(x){
//         1 -> println("One")
//         2 -> println("Two")
//         3 -> println("Four")
//         else -> println("Not Valid")
//     }
// }

// // ii)

// fun main() {
//     val x = 1;
//     when(x) {
//         1,2 -> println("One or Two")
//         3 -> println("Three")
//         4 -> println("Four")
//         else -> println("not valid")
//     }
// }

// iii)

fun main() {
    val x = 1
    when(x) {
        1,2 -> {
            println("One")
            println("Two")
        }
        3 -> println("Three")
        4 -> println("Four")
        else -> println("not valid")
    }
}