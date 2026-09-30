package oop_00000054092_YurcellY.Week05

fun main() {
    println("==================================================")
    println("          LATIHAN TERBIMBING (GUIDED LAB)")
    println("==================================================")

    // val p = Pegawai("Test") // ERROR: Class Abstract tidak bisa di-instansiasi!

    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection: Menghapus deklarasi : List manual
    val daftarPegawai = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // pegawai.mengajar() // ERROR karena tipe referensinya adalah Pegawai

        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast!
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println()
    }

    println("==================================================")
    println("     TUGAS MANDIRI 1: COMPILE-TIME POLYMORPHISM   ")
    println("==================================================")

    val mathHelper = MathHelper()
    val luasPersegi = mathHelper.hitungLuas(5)
    val luasPersegiPanjang = mathHelper.hitungLuas(4, 6)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("Luas Persegi (sisi 5): $luasPersegi")
    println("Luas Persegi Panjang (4x6): $luasPersegiPanjang")
    println("Luas Lingkaran (r=7.0): $luasLingkaran")
    println()

    println("==================================================")
    println("      TUGAS MANDIRI 2: SISTEM PEMBAYARAN         ")
    println("==================================================")


    val myWallet = EWallet(accountName = "John Thor", balance = 50000.0)
    val myCard = CreditCard(accountName = "John Thor", limit = 100000.0)
    // Menghapus deklarasi : List manual
    val daftarPembayaran = listOf(myWallet, myCard)

    for (payment in daftarPembayaran) {
        // Coba transaksi sebesar 75.000
        payment.processPayment(75000.0)
        // Smart Casting Challenge (Jika EWallet gagal karena saldo kurang)
        if (payment is EWallet && payment.balance < 75000.0) {
            payment.topUp(50000.0) // Top up otomatis
            payment.processPayment(75000.0) // Coba bayar ulang
        }
        println("--------------------------------------------------")
    }
}