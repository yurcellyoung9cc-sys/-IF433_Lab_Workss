package oop_00000054092_YurcellY.UTS_00000054092_YurcellYoung

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== UMN CATERING MANAGER SYSTEM ===")

    // [Phase 1: Pre-load Menu Database]
    println("[Database Setup] Adding Nasi Goreng Spesial...")
    val nasiGoreng = FoodMenu("Nasi Goreng Spesial", "nsg01", 0.0)
    // Uji coba set harga negatif untuk menguji custom setter & error handling
    nasiGoreng.basePrice = -15000.0
    // Koreksi harga menjadi 25000
    nasiGoreng.basePrice = 25000.0
    println("[Database Setup] Price updated to Rp 25.000")

    val ayamBakar = FoodMenu("Ayam Bakar Madu", "aym02", 35000.0)
    val esTeh = DrinkMenu("Es Teh Lemon", "lem01", 8000.0, true)

    val menuCatalog = listOf<CateringMenu>(nasiGoreng, ayamBakar, esTeh)

    // [Phase 2: Live Customer Input]
    println("\n--- CUSTOMER DATA INPUT ---")
    print("Enter Customer Name: ")
    val custName = scanner.nextLine()

    print("Enter Phone Number: ")
    val custPhone = scanner.nextLine()

    print("Enter Delivery Address: ")
    val custAddress = scanner.nextLine()

    val customer = Customer(custName, custPhone, custAddress)
    val order = CateringOrder(customer)

    // [Phase 3: Live Order Input Loop]
    var isOrdering = true
    while (isOrdering) {
        println("\nMENU CATALOG")
        menuCatalog.forEachIndexed { index, menu ->
            println("${index + 1}.${menu.name}")
        }
        println("0. [FINISH & CHECKOUT]")

        print("Select Menu Number: ")
        val menuChoice = scanner.nextInt()

        if (menuChoice == 0) {
            println("Processing Checkout...")
            isOrdering = false
        } else if (menuChoice in 1..menuCatalog.size) {
            print("Enter Quantity: ")
            val qty = scanner.nextInt()
            val selectedMenu = menuCatalog[menuChoice - 1]
            order.addMenuToOrder(selectedMenu, qty)
        } else {
            println("[Error] Invalid menu choice, please try again.")
        }
    }

    // [Phase 4: Print Invoice]
    order.status = OrderStatus.COOKING
    println()
    order.printInvoice()
}
