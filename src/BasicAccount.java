public class BasicAccount extends Account{
    protected double withdrawalLimit;


    public BasicAccount(int accountNumber, double withdrawalLimit) {
        super(accountNumber);
        this.withdrawalLimit = withdrawalLimit;

    }

    @Override
    public double Withdraw(double amount) {
        if (amount >= balance) {
        return balance;}
        else {
            return amount;
        }
    }
}
