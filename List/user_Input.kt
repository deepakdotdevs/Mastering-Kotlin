fun main() {
    println("Enter Number of Students : ")
    val num = readLine()!!.toInt()
    println("Enter Student Name : ")
    val students = List<String>(num){readLine()!!}
    for(student in students) {
        println(student)
    }

}

// To run in terminal, cd Array
// kotlinc user_Input_Array.kt -include-runtime -d app.jar
// >> java -jar app.jar