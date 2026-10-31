package oop_00000054092_Yurcelly.week06

interface PaymentMethod {
    fun pay(amount: Double)
}

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Membayar sebesar Rp$amount menggunakan Gopay.")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Membayar sebesar Rp$amount menggunakan Credit Card.")
    }
}