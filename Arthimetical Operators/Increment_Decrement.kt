// Increment -> Let's a Variable a = 10, then -> a++ ++a
// Decrement -> for same, a-- --a

fun main() {
    var a = 5

    // ++a -> add before the print means with print
    println(++a) // return 6
    println(a) // return 6
    println(++a) // return 7

    // a++ -> add after that step when we add it (1)
    println(a++) // return 7 -> Coz in next step print it gives us 8
    println(a) // return 8

    // a-- subtract by 1 at the same time means with print
    println(--a) // return 7
    println(--a) // return 6
    println(--a) // return 5

    // a-- subtract by 1 at the next step or after that initialization means in next step
    println(a--) // return 5
    println(a--) // return 4
    println(a--) // return 3
    println(a) // return 2
}