package Week03

class Employee(val name: String) {
    // Standard property dengan Custom Setter menggunakan Backing Field (field)
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0 // Gunakan field, bukan this.salary untuk menghindari StackOverflow Error
            } else {
                field = value
            }
        }
    // Private Property: Hanya bisa diakses di dalam class ini saja
    private var performanceRating: Int = 3

    // Public Function untuk mengubah private property secara aman
    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }

    // Computed Property (Custom Getter tanpa menyimpan field)
    val tax: Double
        get() = salary * 0.1
}