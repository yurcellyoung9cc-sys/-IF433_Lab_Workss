package oop_00000054092_YurcellY.Week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    // 4. Konfigurasi Pencahayaan (apply & also)
    SmartDevice(
        name = "Philips WiZ Living Room",
        category = "Lighting",
        isOnline = true,
        powerLoad = 12
    ).apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    // 5. Konfigurasi Keamanan (also)
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    // 6. Konfigurasi AC & Kabel (run)
    val acDevice = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acDevice)

    // Alat pakan otomatis peliharaan
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    // 7. Pencarian Aman dengan let
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }

    // 8. Menggunakan with untuk Format Summary
    with(homeDevices) {
        println("Jumlah perangkat terdaftar: ${this.size}")
    }
    // 9. Kalkulasi Daya dengan run
    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total daya: $totalPower Watt")

    // 10. Eksekusi Dashboard
    homeDevices.forEach { device ->
        println(device.diagnose())
    }
}

