#!/usr/bin/env kotlin

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Speaker '$name' aktif dan siap menerima perintah suara.")
    }

    override fun turnOff() {
        println("Smart Speaker '$name' dinonaktifkan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}