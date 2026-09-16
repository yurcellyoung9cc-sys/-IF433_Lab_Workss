package oop_00000054092_YurcellY.week01

fun calculateDiscount(price: Int): Int {
    return if (price > 500000) {
        (price * 0.20).toInt() // Diskon 20%
    } else {
        (price * 0.10).toInt() // Diskon 10%
    }
}

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, note: String?) {
    println("=== STRUK PEMBELIAN STEAMKW ===")
    println("Judul Game : $title")
    println("Harga Asli : Rp $originalPrice")
    println("Harga Akhir: Rp $finalPrice")

    println("Catatan    : ${note ?: "Tidak ada catatan"}")
}

fun main() {
    // Langkah 1: Persiapan Data
    val gameTitle = "Elden Ring"
    val price = 600000

    // Perhitungan Diskon
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    val userNote: String? = null


    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        note = userNote
    )

}