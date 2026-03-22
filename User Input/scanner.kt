// Take User Input using Scanner class : 
import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)

    // For String : 
    println("Enter Your Name = ")
    val name = scanner.next()
    println("Your name is : $name")
    println("Data Type of Name : ${name::class.simpleName}") 

    // For Integer : 
    println("Enter 2 Digits = ")
    val digits = scanner.nextInt()
    println("These two digits are : $digits")
    println("Data Type of Digits : ${digits::class.simpleName}")

}