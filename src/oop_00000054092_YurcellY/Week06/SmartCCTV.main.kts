#!/usr/bin/env kotlin

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV '$name' aktif.")
        startRecord() // Otomatis mulai merekam saat menyala
    }

    override fun turnOff() {
        stopRecord()
        println("CCTV '$name' dimatikan.")
    }

    override fun startRecord() {
        println("CCTV '$name' mulai merekam video keamanan.")
    }
}