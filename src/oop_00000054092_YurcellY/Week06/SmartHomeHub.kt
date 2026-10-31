package oop_00000054092_Yurcelly.week06

class SmartHomeHub {
    private val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat ${device.name} ditambahkan ke Hub.")
    }

    fun activateSecurityMode() {
        println("Mode Keamanan diaktifkan pada Smart Home Hub.")
    }

    fun turnOffAllSwitches() {
        println("Mematikan semua perangkat melalui Smart Home Hub.")
    }
}