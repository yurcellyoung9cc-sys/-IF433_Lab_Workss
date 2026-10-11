package oop_00000054092_YurcellY.UTS_00000054092_YurcellYoung

abstract class CateringMenu(
    val name: String,
    initialMenuCode: String,
    initialBasePrice: Double
) : IBillable {

    var menuCode: String = initialMenuCode
        get() = "UMN-$field"
        set(value) {
            field = value.uppercase()
        }

    var basePrice: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("[Error] Invalid price!")
                // Mempertahankan nilai sebelumnya jika sudah diinisialisasi, atau tetap 0.0 jika baru
            }
        }

    init {
        // Menerapkan setter kustom saat inisialisasi awal
        this.menuCode = initialMenuCode
        this.basePrice = initialBasePrice
    }

    abstract override fun calculateSubtotal(quantity: Int): Double
    abstract override fun printMenuDetails(quantity: Int)
}
