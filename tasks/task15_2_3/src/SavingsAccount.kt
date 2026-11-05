// Task 15.2.3: SavingsAccount class

class SavingsAccount(val rate: Double): BankAccount("yanjani") {

    fun applyInterest(rate: Double) {
        require(rate > 0.0) {"Interest should be greater than 0.0"}
        val multiplier = (rate / 100) + 1
        val amount = balance * multiplier
        BankAccount.deposit(amount)
    }
}
