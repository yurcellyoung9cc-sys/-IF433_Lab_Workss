package Week07

fun processEvent(event: BattleState) {
    val uiMessage = when (event) {
        is BattleState.MonsterEncounter -> "Musuh muncul: ${event.monsterName}! Bersiap bertarung!"
        is BattleState.LootDropped -> "Mendapatkan loot item: ${event.item.name} (${event.item.rarity}) dengan damage ${event.item.damage}!"
        is BattleState.GameOver -> "Game Over! Alasan: ${event.reason}"
        is BattleState.SafeZone -> "Anda berada di zona aman. Silakan beristirahat."
    }
    println(uiMessage)
}
