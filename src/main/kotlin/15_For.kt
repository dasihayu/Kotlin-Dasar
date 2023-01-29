fun main() {

    val names = arrayOf("Eko", "Budi", "Agus")

    var total = 0
    for (name in names) {
        println(name)
        total++
    }
    println("Total perulangan = $total")

    val ukuranArray = names.size -1
    for (i in 0..ukuranArray) {
        println("Index $i = ${names.get(i)}")
    }
}