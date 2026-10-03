#!/usr/bin/env kotlin

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu '$name' dinyalakan dengan kecerahan maksimal.")
    }

    override fun turnOff() {
        println("Lampu '$name' dimatikan.")
    }
}
