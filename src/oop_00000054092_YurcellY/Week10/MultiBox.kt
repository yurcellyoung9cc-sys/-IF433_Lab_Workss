package oop_00000054092_YurcellY.Week10

class PairBox<K, V>(val key: K, val value: V)

println("\n=== TEST MULTIPLE PARAMETERS ===")
val itemPrice = PairBox("Bitcoin", 65000)
println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")
