package oop_00000054092_YurcellY.Week03

fun main() {
    // ==========================================
    // TUGAS 1: TOKO SENJATA (WEAPON)
    // ==========================================
    println("=== TEST TUGAS 1: WEAPON ===")
    val weapon = Weapon("Excalibur")

    // Coba set damage ke -50 (harus gagal / nilai tidak berubah)
    weapon.damage = -50

    // Coba set damage ke 9999 (harus dipaksa jadi 1000)
    weapon.damage = 9999

    // Print Tier-nya (Harus "Legendary" karena damage = 1000)
    println("Senjata: ${weapon.name}")
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}\n")


    // ==========================================
    // TUGAS 2: SISTEM LEVELING (PLAYER)
    // ==========================================
    println("=== TEST TUGAS 2: PLAYER ===")
    val player = Player("JohnThor")

    // player.xp = 100 // Jika di-uncomment, baris ini HARUS ERROR karena xp bersifat private

    // Panggil addXp(50) -> Total XP: 50 (Masih Level 1)
    player.addXp(50)
    println("Level saat ini: ${player.level}")

    // Panggil addXp(60) -> Total XP: 110 (Harus Level Up ke Level 2)
    player.addXp(60)
    println("Level saat ini: ${player.level}")
}