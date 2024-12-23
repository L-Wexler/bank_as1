public class AccountImpl extends Account {

    public AccountImpl(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public double Withdraw(double amount) {
        if (amount > balance) {
            double withdrawn = balance; // נמשוך רק את מה שנשאר בחשבון
            balance = 0; // היתרה מתאפסת
            return withdrawn; // מחזירים את הסכום שנמשך
        } else {
            balance -= amount; // מעדכנים את היתרה
            return amount; // מחזירים את הסכום שנמשך
        }
    }
}
