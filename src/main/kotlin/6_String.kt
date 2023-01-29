fun main() {
    var firstName: String = "Dasi"
    var lastName: String = "Hayupermana"
    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}