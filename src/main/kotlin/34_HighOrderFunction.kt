fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = {value : String -> value.toUpperCase()}
    println(hello("Dasi", lambdaUpper))
    println(hello("Dasi", {value : String -> value.toLowerCase()}))

    val result1 = hello("Dasi", {value: String -> value.toLowerCase()})
    val result2 = hello("Dasi"){value: String ->
        value.toLowerCase()
    }
}