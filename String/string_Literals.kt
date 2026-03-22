// String Literals - Escaped String
// String Literals - Raw String

// Escaped String : 

// fun main() {
//     println("Hello\nWorld") // \n for next line
//     println("Hello\tWorld !!") // for tab
// }

// Raw String : 
fun main() {
    val message = """Dear Sir,
    i want to inform to check my application for the Android App \
    Development and please provide\n me a internship at stipend of 1 Lakh + """.trimIndent() // in this \n is not work
    println(message)
}