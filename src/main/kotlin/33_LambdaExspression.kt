fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    val lambdaName: (String, String) -> String = {firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = lambdaName("Dasi", "Hayupermana")
    println(result)

    val hello: (String) -> String = {
        "Hello $it"
    }

    println(hello("Dasi"))

    val name:(String) -> String = ::toUpper
    println(name("dasi"))
}