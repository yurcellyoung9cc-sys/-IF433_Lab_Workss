package oop_00000054092_YurcellY.Week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0
    override fun processPayment(amount: Double): Boolean {
        return if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[\(accountName - CreditCard] Pembayaran sebesar Rp\)amount BERHASIL. Total terpakai: Rp\(usedAmount / Limit: Rp\)limit")
            true
        } else {
            println("[\(accountName - CreditCard] GAGAL: Transaksi ditolak karena melebihi limit (Terpakai: Rp\)usedAmount, Limit: Rp$limit)")
            false
        }
    }
}