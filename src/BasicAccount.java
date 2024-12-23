public class BasicAccount extends Account{
    protected double withdrawalLimit;


    public BasicAccount(int accountNumber, double withdrawalLimit) {
        super(accountNumber);
        this.withdrawalLimit = withdrawalLimit;

    }

    @Override
    public double Withdraw(double amount) {
        if (amount > withdrawalLimit) {
            amount = withdrawalLimit;
        }
        if (amount > balance) {
            amount = balance;
        }
        balance -= amount;
        return amount;

     }

    }
