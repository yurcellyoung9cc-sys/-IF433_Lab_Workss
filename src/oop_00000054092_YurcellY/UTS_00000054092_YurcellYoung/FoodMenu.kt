package oop_00000054092_YurcellY.UTS_00000054092_YurcellYoung

class FoodMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val packagingFee: Double = 3000.0
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        return (basePrice + packagingFee) * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotalFormatted = String.format("Rp %,d", calculateSubtotal(quantity).toInt()).replace(',', '.')
        println("1. [FOOD] $menuCode - $name") // Catatan: nomor urut dinamis saat cetak invoice diatur di CateringOrder
        println("   Qty: $quantity portions | Subtotal: $subtotalFormatted")
    }
}
