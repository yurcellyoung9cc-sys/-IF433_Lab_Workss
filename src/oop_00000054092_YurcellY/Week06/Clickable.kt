package oop_00000054092_YurcellY.week06

// LANGKAH 1 (Trial - Sengaja Error):
// Un-comment kode di bawah untuk mencoba error backing field pada Interface:
/*
interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"
    
    fun click()
}
*/

// LANGKAH 2 (Fix):
// Checkpoint 2: "week06: fix Clickable interface using abstract property"
interface Clickable {
    val name: String // Abstract property
    fun click()
}