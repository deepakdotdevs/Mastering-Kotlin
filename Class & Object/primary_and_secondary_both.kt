// // Method 1 : 

// class Registration(email:String, password:String) {
//     // properties
//     var hName: String = "" // in seconday
//     var hAge:Int? = null // also secondary
//     var hEmail:String = email // in primary directly initializer block here we use
//     var hPassword:String // in primary in instializer block
//     var gender:String = "Female"

//     // Secondary Constructor
//     constructor(name:String, age:Int, email:String, password:String)
//     :this(email, password) {
//         hName = name
//         hAge = age
//     }

//     // Initializer for primary 
//     init {
//         hPassword = password
//     }
//     // Member Function
//     fun disp() {
//         println("Name = $hName")
//         println("Age = $hAge")
//         println("Email = $hEmail")
//         println("Password = $hPassword")
//         println("Gender = $gender")

//     }
// }
// fun main() {
//     val user1 = Registration("Rashmi", 26, "rashmi123@gmail.com", "1234567")
//     user1.disp()
// }

// Method 2 : 

class Registration1(_email:String, _password:String) {
    // properties
    var name: String = "" // in seconday
    var age:Int? = null // also secondary
    var email:String // in primary directly initializer block here we use
    var password:String // in primary in instializer block
    var gender:String = "Female"

    // Secondary Constructor
    constructor(name:String, age:Int, _email:String, _password:String)
    :this(_email, _password) {
        this.name = name
        this.age = age
    }

    // Initializer for primary 
    init {
        password = _password
        email = _email
    }
    // Member Function
    fun disp() {
        println("Name = $name")
        println("Age = $age")
        println("Email = $email")
        println("Password = $password")
        println("Gender = $gender")

    }
}
fun main() {
    val user1 = Registration1("Rashmi", 26, "rashmi123@gmail.com", "1234567")
    user1.disp()
} 