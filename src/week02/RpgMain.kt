package week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== GAME MINI RPG BATTLE ===")

    // 1. Input nama Hero & stat Damage
    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, damage)

    // 2. Variabel bantuan untuk HP Musuh
    var enemyHp = 100

    println("\nPertarungan Dimulai!")
    println("Hero HP: ${hero.hp} | Enemy HP: $enemyHp\n")

    // 3. Main Loop (while Hero hidup DAN enemyHp > 0)
    while (hero.isAlive() && enemyHp > 0) {
        println("=== MENU AKSI ===")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi (1/2): ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            // Hero menyerang
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP Musuh: $enemyHp")

            // Jika Musuh belum mati, Musuh membalas!
            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh membalas serangan sebesar $enemyDamage damage!")
                hero.takeDamage(enemyDamage)
                println("Sisa HP ${hero.name}: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} memilih untuk kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid, coba lagi!")
        }
        println()
    }

    // 4. Pengumuman Pemenang
    println("\n=== HASIL AKHIR ===")
    if (hero.isAlive() && enemyHp == 0) {
        println("Selamat! ${hero.name} MENANG!")
    } else if (!hero.isAlive()) {
        println("Kalah! ${hero.name} telah gugur.")
    } else {
        println("Pertarungan selesai tanpa pemenang (Kabur).")
    }
}
