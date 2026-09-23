package week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== SISTEM PEMINJAMAN PERPUSTAKAAN ===")

    // 1. Input Judul, Peminjam, dan Lama Pinjam
    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // 2. Validasi: Jika minus, otomatis ubah menjadi 1 hari
    if (duration < 0) {
        println("WARNING: Lama pinjam tidak boleh minus! Otomatis diubah menjadi 1 hari.")
        duration = 1
    }
    // 3. Buat objek Loan dan Print detail
   // val loan = Loans(bookTitle, borrower, duration)

//    println("\n=== DETAIL PEMINJAMAN ===")
//    println("Judul Buku  : ${loan.bookTitle}")
//    println("Peminjam    : ${loan.borrower}")
//    println("Lama Pinjam : ${loan.loanDuration} hari")
//    println("Total Denda : Rp ${loan.calculateFine()}")
}