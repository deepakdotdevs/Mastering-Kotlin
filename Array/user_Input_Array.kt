fun main() {
    println("Enter Number of Student : ")
    val stuNo = readLine()!!.toInt()
    println("Enter Student Name : ")
    val students = Array(stuNo){readLine()!!}
    for(student in students) {
        println(student)
    }
}

// To run in terminal, cd Array
// kotlinc user_Input_Array.kt -include-runtime -d app.jar
// >> java -jar app.jar