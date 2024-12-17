public class StandardAccount extends Account{

    protected double creditLimit;

    public StandardAccount(int accountNumber, double creditLimit) {
        super(accountNumber);
        if (creditLimit <0) {
            this.creditLimit = creditLimit;
        }
        else {
            this.creditLimit = 0;
        }
    }

    //behaviour


    public double Withdraw(double amount){
        if (amount >= balance - creditLimit ) {
            double x = balance - creditLimit;
            balance = creditLimit;
            return x;
        }
        else {
            balance -= amount;
            return amount;
        }
    }
}

