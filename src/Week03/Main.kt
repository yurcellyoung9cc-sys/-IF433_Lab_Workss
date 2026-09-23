package Week03

fun main() {
    println("=== GUIDED LAB: EMPLOYEE ===")
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000 // Error: Gaji tidak boleh negatif
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.performanceRating = 5 // Ini akan Error (Unresolved reference / Red) karena private

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n=== TUGAS 1: WEAPON ===")
    val w = Weapon("Excalibur")

    // Tes Damage Negatif (Nilai tidak berubah/gagal)
    w.damage = -50

    // Tes Damage > 1000 (Otomatis dipaksa ke 1000)
    w.damage = 9999

    println("Weapon Name: ${w.name}")
    println("Weapon Damage: ${w.damage}")
    println("Weapon Tier: ${w.tier}")

    println("\n=== TUGAS 2: PLAYER ===")
    val player = Player("Knight99")

    // player.xp = 100 // Ini akan Error karena property xp bersifat private

    // Penambahan XP Pertama (+50 XP -> Total: 50, Level 1)
    player.addXp(50)
    println("Level ${player.username} saat ini: ${player.level}")

    // Penambahan XP Kedua (+60 XP -> Total: 110, Level Up ke 2)
    player.addXp(60)
    println("Level ${player.username} saat ini: ${player.level}")
}