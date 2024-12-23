public class StandardAccount extends Account {

    protected double creditLimit;

    public StandardAccount(int accountNumber, double creditLimit) {
        super(accountNumber);
        if (creditLimit < 0) {
            this.creditLimit = creditLimit; // אם המגבלה שלילית, נשתמש בה
        } else {
            this.creditLimit = 0; // אחרת, נקבע את המגבלה ל-0
        }
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


