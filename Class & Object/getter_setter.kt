class User (_id:Int, _name:String, _age:Int) {
    val id:Int = _id
    get() = field // this is the getter of variabld id

    var name:String = _name
    get() = field // getter of the variable name
    set(value){ // setter of variable name
        field=value
    }
    var age:Int = _age // getter of age
    get() = field
    set(value) { // setter of age
        field=value
    }
}
fun main() {
    val u1 = User(1, "Deepak", 27)
    println(u1.id) // this is the example how to get property  // get property
    println(u1.name) // get property
    println(u1.age) // get property

    u1.name = "Rahul" // set property
    u1.age = 18 // set property
    println(u1.name)
    println(u1.age)

}