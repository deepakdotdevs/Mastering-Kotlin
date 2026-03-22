// Take User Input using Scanner class : 
import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)

    // For String : 
    println("Enter Your Name = ")
    val name = scanner.next()
    println("Your name is : $name")
    println("Data Type of Name : ${name::class.simpleName}") 

}