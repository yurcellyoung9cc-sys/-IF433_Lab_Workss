package oop_00000054092_YurcellY.Week10

data class Coin(val name: String, val balance: Double)
data class Transaction(val id: String, val amount: Double)

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
}
