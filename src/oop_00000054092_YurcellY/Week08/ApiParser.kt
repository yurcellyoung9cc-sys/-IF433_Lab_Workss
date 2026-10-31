package oop_00000054092_YurcellY.Week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak id dan name dengan requireNotNull (throw IllegalArgumentException jika null/hilang)
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                // Ambil warranty dengan as? Int, jika gagal/korup gunakan fallback Elvis ?: 12
                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                // Ambil size dengan as? String, jika gagal gunakan fallback Elvis ?: "All Size"
                val size = rawJson["size"] as? String ?: "All Size"
                Product.Clothing(id, name, size)
            }
            else -> null
        }
    }


    fun checkout(product: Product) {
        val id = when (product) {
            is Product.Electronic -> product.id
            is Product.Clothing -> product.id
        }

        // Memanggil Java interop dan menggunakan '!!' karena diyakini selalu sukses mengembalikan string
        val transactionResult = JavaPaymentService.processPayment(id)
        val verifiedTxId = transactionResult!!
        println("Checkout Sukses! Transaction ID: $verifiedTxId")
    }
}
