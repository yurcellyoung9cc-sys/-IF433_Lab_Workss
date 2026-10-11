package oop_00000054092_YurcellY.UTS_00000054092_YurcellYoung

class CateringOrder(
    val customer: Customer,
    var status: OrderStatus = OrderStatus.WAITING_LIST
) {
    private val orderItems: MutableList<Pair<CateringMenu, Int>> = mutableListOf()

    fun addMenuToOrder(menu: CateringMenu, qty: Int) {
        orderItems.add(Pair(menu, qty))
        println("Order successfully added!")
    }

    fun printInvoice() {
        val formatter = java.text.NumberFormat.getInstance(java.util.Locale("id", "ID"))

        println("================ INVOICE ================")
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAddress}")
        println("Order Status: $status")

        var grandTotal = 0.0
        orderItems.forEachIndexed { index, pair ->
            val menu = pair.first
            val qty = pair.second
            val subtotal = menu.calculateSubtotal(qty)
            grandTotal += subtotal

            print("${index + 1}. ")
            menu.printMenuDetails(qty)
        }

        val grandTotalStr = formatter.format(grandTotal)
        println("GRAND TOTAL: Rp $grandTotalStr")
        println("=========================================")
    }
}
