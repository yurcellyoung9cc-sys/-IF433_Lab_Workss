package week02

// Class Loan dengan Primary Constructor & Default Argument loanDuration = 1
class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    // Method untuk menghitung denda
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}