package oop_00000054092_YurcellY.Week10

fun main() {
    // 5. Inisialisasi Dashboard
    val coinRepo = WalletRepository<Coin>()

    // 6. Mengisi Data Dompet (Minimal 3 koin)
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 12.0))
    coinRepo.add(Coin("USDT", 2500.0))

    // 7. Simulasi Response Jaringan
    val response = ApiResponse("200 OK", coinRepo.getAll())

    // 8. Menampilkan Data menggunakan forEach
    println("=== CRYPTO DASHBOARD ===")
    println("Status: ${response.status}")
    println("Daftar Koin dari Response:")
    response.data.forEach { coin ->
        println("- Koin: ${coin.name}, Saldo: ${coin.balance}")
    }


    // 9. Inisialisasi dan Pengisian Data Transaksi
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-001", 150.0))
    txRepo.add(Transaction("TX-002", 500.0))

    println("\nDaftar Transaksi:")
    txRepo.getAll().forEach { tx ->
        println("- ID: ${tx.id}, Jumlah: ${tx.amount}")
    }
}