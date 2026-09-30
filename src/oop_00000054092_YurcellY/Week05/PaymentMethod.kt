package oop_00000054092_YurcellY.Week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double): Boolean
}