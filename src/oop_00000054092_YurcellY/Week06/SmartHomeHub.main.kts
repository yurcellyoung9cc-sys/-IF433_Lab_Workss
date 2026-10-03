#!/usr/bin/env kotlin

class SmartHomeHub {
    val devices = mutableListOf()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Berhasil menambahkan '${device.name}' ke SmartHomeHub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Semua Perangkat ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff() // Smart Cast ke Switchable
            }
        }
    }

    fun activateSecurityMode() {
        println("\n--- Mengaktifkan Mode Keamanan ---")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord() // Smart Cast ke Recordable
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan") // Smart Cast ke SmartSpeaker
            }
        }
    }
}