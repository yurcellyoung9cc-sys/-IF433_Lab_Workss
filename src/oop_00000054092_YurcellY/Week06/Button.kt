package oop_00000054092_YurcellY.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}