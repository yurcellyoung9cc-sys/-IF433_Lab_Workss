package oop_00000054092_YurcellY.Week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double): Boolean {
        return if (balance >= amount) {
            balance -= amount
            println("[\(accountName - EWallet] Pembayaran sebesar Rp\)amount BERHASIL. Sisa saldo: Rp$balance")
            true
        } else {
            println("[\(accountName - EWallet] GAGAL: Saldo tidak cukup (Saldo saat ini: Rp\)balance, Butuh: Rp$amount)")
            false
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[\(accountName - EWallet] Top Up sebesar Rp\)amount BERHASIL. Saldo sekarang: Rp$balance")
    }
}