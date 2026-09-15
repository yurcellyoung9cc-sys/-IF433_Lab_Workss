package oop_00000054092_YurcellY.week01

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main () {
    val name: String = "John Thor"
    val score: Int = 80

    println("Nama " + name + "score " + score)

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("grade kamu $grade")

    println("Status: ${calculateStatus(score)}")
}
