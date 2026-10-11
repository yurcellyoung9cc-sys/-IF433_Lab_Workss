package Week07

fun main() {
    // --- TEST LAB 1: Singleton & Companion Object ---
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val netClient = NetworkClient.createClient()
    netClient.connect()

    // --- TEST LAB 2: Regular vs Data Class ---
    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}") // False

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}") // True

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")
    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    // --- TEST LAB 3: Sealed Class & Exhaustive When ---
    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")
    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    // --- TUGAS MANDIRI SIMULASI ---
    println("\n=== SIMULASI TUGAS MANDIRI RPG ===")

    // 1. Singleton GameManager
    GameManager.startGame()
    GameManager.startGame() // Membuktikan pencegahan duplikasi

    // 2. Enum Rarity & Factory
    println("Drop Chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata Awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}, Durability: ${starterWeapon.durability}")

    // 3. Modifikasi Immutability (Copy) & Event Dispatch
    val upgradedItem = starterWeapon.item.copy(damage = 25)


    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}