// make a another class with name my_java.java

// calling java from kotlin

fun main() {
    val obj = my_Java()
    obj.setValue(10)
    println(obj.getValue())
    println(obj.a) // can't be access coz of private modifier
}

// For run this code in terminal write : 
// cd "d:\Kotlin\Using Java Code in Kotlin"
// kotlinc example.kt my_Java.java
// java Example.Kt