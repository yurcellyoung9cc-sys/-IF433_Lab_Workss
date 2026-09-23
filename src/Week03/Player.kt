package Week03

class Player(val username: String) {
    // Private property: tidak bisa diubah langsung dari luar
    private var xp: Int = 0

    // Computed Property untuk menghitung Level berdasarkan XP
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP yang ditambahkan harus angka positif!")
            return
        }

        val previousLevel = level
        xp += amount

        // Cek jika terjadi kenaikan level
        if (level > previousLevel) {
            println("Level Up! Selamat $username naik ke level $level")
        }
    }
}
