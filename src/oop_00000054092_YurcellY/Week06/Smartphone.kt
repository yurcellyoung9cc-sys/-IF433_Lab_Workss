package oop_00000054092_YurcellY.week06

// LANGKAH 2 (Trial - Error):
/*
class Smartphone : Camera, Phone {
    // ERROR: Inherits multiple implementations of turnOn()
}
*/
// LANGKAH 3 (Fix):
class Smartphone : Camera, Phone {
    override fun turnOn() {
        super.turnOn() // Menjalankan logika Camera
        super.turnOn()  // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}