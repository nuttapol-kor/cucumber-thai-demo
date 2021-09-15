package demo;

public class BankAccount {
    private double balance;

    public BankAccount () {
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return this.balance;
    }
}
