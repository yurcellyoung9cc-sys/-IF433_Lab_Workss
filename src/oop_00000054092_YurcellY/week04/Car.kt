package week04

// Car "Is-A" Vehicle. Parameter brand dilempar ke atas melalui Vehicle(brand)
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
    // Overriding method honk
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
    // Overriding method accelerate dengan memanfaatkan keyword 'super'
    override fun accelerate() {
        super.accelerate() // Memanggil logika penambahan kecepatan milik Parent
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}