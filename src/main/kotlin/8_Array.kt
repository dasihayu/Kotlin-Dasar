fun main() {
    var names: Array<String> = arrayOf("Dasi", "Hayu", "Permana")

//    names.set(0, "Joko")
    names[0] = "Joko"
    println(names[0])

    var nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(5)

    members[0] = "Eko"
    members[1] = "Joko"
    members[2] = "Edi"
    members[3] = null
    members[4] = "Budi"
    println(members.size)
}