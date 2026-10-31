package oop_00000054092_YurcellY.Week08

fun main() {
    println("=== E-COMMERCE API PARSER PIPELINE ===")

    // Data kotor JSON sesuai skenario tugas mandiri
    val rawApiData: List<Map<String, Any?>> = listOf(
    mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
    mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
    mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
    mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
    mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )
    // Instansiasi ApiParser
    val parser = ApiParser()

    // Proses batch collection dengan iterasi dan try-catch
    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            // Jika sukses dan tidak null, panggil method checkout() menggunakan ?.let
            product?.let {
                println("\nBerhasil memparsing produk: ${it.javaClass.simpleName}")
                parser.checkout(it)
            } ?: println("Log: Item dilewati karena tipe tidak dikenali (FOOD/null).")

        } catch (e: IllegalArgumentException) {
            // Menangkap data korup seperti missing ID
            println("Peringatan Log (Data Korup): ${e.message} pada data: $raw")
        }
    }
}
