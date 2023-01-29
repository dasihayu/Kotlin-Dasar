inline fun hello(name: () -> String,
                 noinline lastName: () -> String): String {
    return "Hello ${name()} ${lastName()}"
}

fun main() {
    for (i in 1..100) {
        println(hello({"Dasi"}, {"Hayu"}))
    }

}