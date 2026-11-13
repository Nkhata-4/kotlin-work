package comp2850.banking

class StudentAccount(overdraft: Int) : BankAccount(holder) {

    var overdraft: Int = 0
        set(value) {
            require(overdraft <= 100) { throw IllegalArgumentException("Overdraft limit must be in range 0 - 100") }
        }
        field = value

    
    //abstract
    fun withdrawalsAllowed(): Boolean {
        if (balance - amount < -overdraft) {
            return false
        }
        else {
            return true
        }
    }

    override fun withdraw(amount: Double): Boolean {
        require(amount > 0) { throw IllegalArgumentException("Withdrawal amount must be greater than 0") }
    
        if (balance - amount < -overdraft) {
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        }
        else {
            return balance -= amount
        }
    }
    
    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }

}