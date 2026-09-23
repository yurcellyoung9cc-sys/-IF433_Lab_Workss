package Week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif! Nilai tidak diubah.")
                // field tetap bernilai lama
            } else if (value > 1000) {
                println("Peringatan: Damage melebihi batas (Overpowered)! Dipaksa ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    // Computed Property untuk menghitung Tier senjata
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}