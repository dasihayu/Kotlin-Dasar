fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Int {
    if (b == 0){
        return 0
    } else{
        val hasil = a / b
        return hasil
    }


}

fun main() {

    println(sum(100,234))
    println(sum(12,23))

    val result = sum(5, 12)
    println(result)

    val pembagian = (bagi(10, 2))
    println(pembagian)

    println(bagi(10, 5))
    println(bagi(9, 0))
}