package oop_00000054092_YurcellY.Week08

fun main() {
    println("=== E-COMMERCE API PARSER PIPELINE ===")

    val rawApiData: List> = listOf(
    mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
    mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
    mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
    mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
    mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )


    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                println("\nBerhasil memparsing produk: ${it.javaClass.simpleName}")
                parser.checkout(it)
            } ?: println("Log: Item dilewati karena tipe tidak dikenali (FOOD/null).")
        } catch (e: IllegalArgumentException) {
            println("Peringatan Log (Data Korup): ${e.message} pada data: $raw")
        }
    }
}