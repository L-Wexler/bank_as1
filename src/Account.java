public abstract class Account implements IAccount {
    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    @Override
    public void Deposit(double amount) {
        balance += amount;
    }

    @Override
    public abstract double Withdraw(double amount);

    @Override
    public double GetCurrentBalance() {
        return balance;
    }

    @Override
    public int GetAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
