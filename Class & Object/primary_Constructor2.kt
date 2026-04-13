// // constructor
// // primary constructor

// class Human (name:String, age:Int) { //by default is var we can val it
//     // properties
//     var hName:String // initialise in initializer block
//     var hAge:Int
//     var gender:String = "Female"

//     // initializer Block
//     init {
//         hName = name // here we pass it the constructor
//         hAge = age // that's how we can initialize the properties with constructor's values 
//     }

//     // member function
//     fun disp() {
//         println("Name = $hName")
//         println("Age = $hAge")
//         println("Gender = $gender")
//     }
// }
// fun main(){
//     val h1 = Human("Sonam", 24)
//     h1.disp()

//     val h2 = Human("Deepak", 25)
//     h2.disp()
// }

// Directly Initializer Block : 

class Human (name:String, age:Int) { //by default is var we can val it
    // properties
    var hName:String = name // initialise in initializer block
    var hAge:Int = age // here we indirectly use initializer Block
    var gender:String = "Female"

    // member function
    fun disp() {
        println("Name = $hName")
        println("Age = $hAge")
        println("Gender = $gender")
    }
}
fun main(){
    val h1 = Human("Sonam", 24)
    h1.disp()

    val h2 = Human("Deepak", 25)
    h2.disp()
}