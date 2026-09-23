package week03
class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif! Nilai tidak diubah.")
                // Jika nilai sebelum diubah belum pernah di-set, kita pastikan field tetap memegang nilai lamanya
                field = field
            } else if (value > 1000) {
                println("Peringatan: Damage tidak boleh lebih dari 1000 (Overpowered)! Dipaksa ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    // Computed Property / Custom Getter untuk Tier
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}