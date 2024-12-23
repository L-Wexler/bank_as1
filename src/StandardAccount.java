public class StandardAccount extends Account {

    protected double creditLimit;

    public StandardAccount(int accountNumber, double creditLimit) {
        super(accountNumber);
        this.creditLimit = (creditLimit < 0) ? creditLimit : 0; // מבטיח שהמגבלה שלילית, אחרת היא 0
    }

    @Override
    public double Withdraw(double amount) {
        if (balance - amount < creditLimit) {
            double allowedAmount = balance - creditLimit; // מה שניתן למשוך עד גבול האשראי
            balance = creditLimit; // מעדכן את היתרה ל-creditLimit
            return allowedAmount; // מחזיר את הסכום שנמשך
        } else {
            balance -= amount; // אם לא חורגים, פשוט מעדכנים את היתרה
            return amount;
        }
    }
}

