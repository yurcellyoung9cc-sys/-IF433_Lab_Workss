package oop_00000054092_Yurcelly.week06

// Fungsi Decoupled Latihan Terbimbing 4
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    println("=== TESTING LATIHAN TERBIMBING ===")
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    println("\n==========================================")
    println("=== TESTING TUGAS MANDIRI (SMART HOME) ===")
    println("==========================================")

    // Checkpoint 19: Instansiasi Perangkat
    val lamp = SmartLamp(id = "L01", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "S01", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "C01", name = "Ezviz Garasi")
}