package Week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(45),
    RARE(20),
    EPIC(5),
    LEGENDARY(1)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)
