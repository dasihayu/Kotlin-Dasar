fun sayHello(firstName:String, lastName: String?){
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Budi", "Susanto")
    sayHello("Dasi", "Hayupermana")
    sayHello("Joko", null)
}