package oop_00000054092_YurcellY.Week06


open class SmartDevice(val id: String, val name: String) {
    fun turnOn() {
        println("Perangkat $name ($id) dinyalakan.")
    }
}

class Smartwatch : SmartDevice("W01", "Smartwatch") {
    fun showTime() {
        println("Menampilkan waktu pada Smartwatch.")
    }
}

class Smartphone : SmartDevice("P01", "Smartphone")

class SmartLamp(id: String, name: String) : SmartDevice(id, name)
class SmartSpeaker(id: String, name: String) : SmartDevice(id, name)
class SmartCCTV(id: String, name: String) : SmartDevice(id, name)