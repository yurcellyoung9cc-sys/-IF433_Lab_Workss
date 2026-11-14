package oop_00000054092_YurcellY.Week10

fun main() {
    // Inisialisasi dan pengisian data koin
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 2.5))
    coinRepo.add(Coin("ETH", 15.0))
    coinRepo.add(Coin("USDT", 1000.0))

    // Bungkus data dalam ApiResponse
    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO DASHBOARD ==Status: ${response.status}")
    println("Daftar Koin dari Response:")
    response.data.forEach { coin ->
        println("- Koin: ${coin.name}, Saldo: ${coin.balance}")
    }

    // Inisialisasi dan pengisian data transaksi
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-001", 150.0))
    txRepo.add(Transaction("TX-002", 500.0))

    println("\nDaftar Transaksi:")
    txRepo.getAll().forEach { tx ->
        println("- ID: ${tx.id}, Jumlah: ${tx.amount}")
    }
}
