fun String.hello(): String {
    return "Hello $this"
}

fun String.test(): Unit = println("Hello $this")

fun main() {
    val name: String = "Dasi"
    println(name.hello())

    "Yupe".test()
}