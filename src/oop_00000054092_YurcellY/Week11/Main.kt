package oop_00000054092_YurcellY.Week11


fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))
    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}