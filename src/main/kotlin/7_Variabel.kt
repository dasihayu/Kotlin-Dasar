const val APP ="Belajar Kotlin"
const val VERSION ="0.0.1"


fun main() {
    val firstName: String = "Dasi"
    val age = 15

    println(firstName)
    println(age)

    var name: String? = null
    name = "Dasi"
    println(name)
    println(name?.length)
    println("Welcome to $APP version $VERSION")
}