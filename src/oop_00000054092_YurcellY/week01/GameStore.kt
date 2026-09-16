package oop_00000054092_YurcellY.week01

fun calculateDiscount(price: Int): Int {
    return if (price > 500000) {
        (price * 0.20).toInt() // Diskon 20%
    } else {
        (price * 0.10).toInt() // Diskon 10%
    }
}

fun main() {
    // Langkah 1: Persiapan Data
    val gameTitle = "Elden Ring"
    val price = 600000

    // Perhitungan Diskon
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

}