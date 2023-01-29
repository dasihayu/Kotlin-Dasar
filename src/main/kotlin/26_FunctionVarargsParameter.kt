fun hitungTotal(name:String, vararg values: Int) : Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total
}

fun main() {
    val result = hitungTotal("Dasi",2,3,3,1,5,6,76,543,34)
    println(result)
}