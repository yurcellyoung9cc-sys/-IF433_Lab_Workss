package week04

fun main() {
    // --- GUIDED LAB TESTING ---
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()   // Memanggil method milik sendiri
    myCar.honk()        // Memanggil method yang sudah di-override
    myCar.accelerate()  // Memanggil gabungan method Parent dan Child
    // --- TUGAS MANDIRI 1 TESTING ---
    println("\n--- Testing ElectricCar ---")
    val myEv = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myEv.openTrunk()
    myEv.honk()
    myEv.accelerate()

    // --- TUGAS MANDIRI 2 TESTING ---
    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager(name = "Budi", baseSalary = 10000000)
    val developer = Developer(name = "Andi", baseSalary = 8000000, programmingLanguage = "Kotlin")

    manager.work()
    println("Bonus ${manager.name}: Rp ${manager.calculateBonus()}")

    println()

    developer.work()
    println("Bonus ${developer.name}: Rp ${developer.calculateBonus()}")
}