fun main() {
    val nilai = 'D'
    val lulus = arrayOf('A', 'B', 'C')

    when (nilai) {
        'A' -> {
            println("SANGAR COK")
        }
        'B' -> {
            println("ANJIR")
        }
        'C' -> {
            println("Good Job")
        }
        'D' -> {
            println("Gapapa")
        }
        'E' -> {
            println("Tahun Depan ya")
        }
        else -> {
            println("SEMANGAT")
        }
    }

    when (nilai) {
        'A', 'B','C' -> {
            println("Lulus")
        }
        else -> {
            println("NT")
        }
    }

    when (nilai) {
        in lulus -> println("Anda Lulus")
        !in lulus -> println("Tahun Depan Coba Lagi")
    }


    val name = "Dasi"
    when(name){
        is String -> println("Ini String")
        !is String -> println("Ini Bukan String")
    }

    val nilaiujian = 90
    when{
        nilaiujian > 90 -> println("KEREN")
        nilaiujian > 75 -> println("GOOD JOB")
        else -> println("Tahun Depan")
    }
}