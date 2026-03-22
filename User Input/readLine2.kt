fun main() {
    println("Enter Your Name = ")
    val name  = readLine();
    println("Name : $name")
    println("Data Type of this : ${name!!::class.simpleName}")

    // For Integer

    println("Enter Your Roll No. = ")
    val roll_No = readLine()!!.toInt();
    println("Roll No. : $roll_No")
    println("Roll No. Data type is this : ${roll_No::class.simpleName}")
}