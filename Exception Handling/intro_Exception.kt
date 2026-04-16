fun main() {
    val result = try { // jo exception throw kr skta hai vo es block mein likkha jata hai
        val a = 10/0 // throw exception, agar exception throw hoga to vo catch block mein chala jayega
        a // it's returns a
    } catch (e:Exception) { // execute tb hota hai jb exception occur hota hai only then
        e.message
    } finally { // execute every time whether or not exception is there
        println("ALways Executes")
    }
    println(result)
}