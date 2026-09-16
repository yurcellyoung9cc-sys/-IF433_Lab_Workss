package oop_00000054092_YurcellY.week01

fun main(args: Array<String>) {
// Variable definition
    val radius: Double = 7.0
    val pi: Double = 3.14
// Calculation
    val area = pi * radius * radius


    println("Radius: $radius, Area: \$area")
    // Logic check
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}