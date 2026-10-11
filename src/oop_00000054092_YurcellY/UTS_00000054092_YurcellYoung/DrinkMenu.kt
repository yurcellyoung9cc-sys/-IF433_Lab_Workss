package oop_00000054092_YurcellY.UTS_00000054092_YurcellYoung

class DrinkMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val isLargeSize: Boolean
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        val finalPrice = if (isLargeSize) basePrice + 5000.0 else basePrice
        return finalPrice * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val sizeLabel = if (isLargeSize) " (Large)" else " (Regular)"
        val subtotalFormatted = String.format("Rp %,d", calculateSubtotal(quantity).toInt()).replace(',', '.')
        println("$menuCode - $name$sizeLabel")
        println("   Qty: $quantity cups | Subtotal: $subtotalFormatted")
    }
}
