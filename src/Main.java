public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

        // יצירת חשבונות
        IAccount account1 = new StandardAccount(1, -100); // חשבון עם מגבלת אשראי של -100
        IAccount account2 = new BasicAccount(2, 1000); // חשבון עם מגבלת משיכה של 1000
        IAccount account3 = new PremiumAccount(3); // חשבון פרימיום ללא מגבלות

        // הוספת חשבונות לבנק
        bank.OpenAccount(account1);
        bank.OpenAccount(account2);
        bank.OpenAccount(account3);

        // הפקדת 1000 בכל חשבון
        System.out.println("Depositing 1000 in each account...");
        account1.Deposit(1000);
        account2.Deposit(1000);
        account3.Deposit(1000);

        // משיכת 3000 מכל חשבון
        System.out.println("\nWithdrawing 3000 from each account...");
        System.out.println("Withdrawn " + account3.Withdraw(3000) + " From Premium Account");
        System.out.println("Withdrawn " + account2.Withdraw(3000) + " From Basic Account");
        System.out.println("Withdrawn " + account1.Withdraw(3000) + " From Standard Account");

        // הדפסת יתרות נוכחיות
        System.out.println("\nCurrent Balance in account number 3(Premium) is " + account3.GetCurrentBalance());
        System.out.println("Current Balance in account number 2(Basic) is " + account2.GetCurrentBalance());
        System.out.println("Current Balance in account number 1(Standard) is " + account1.GetCurrentBalance());

        // בדיקת חשבונות במינוס
        System.out.println();
        if (account1.GetCurrentBalance() < 0) {
            System.out.println("Account 1 is in debt");
        }
        if (account3.GetCurrentBalance() < 0) {
            System.out.println("Account 3 is in debt");
        }

        // סגירת כל החשבונות
        System.out.println("\nClosing all accounts in the bank...");
        bank.CloseAccount(1);
        bank.CloseAccount(2);
        bank.CloseAccount(3);
        System.out.println("There are " + bank.GetAllAccounts().size() + " accounts in the bank");

        // הפקדת 2000 בכל חשבון
        System.out.println("\nDepositing 2000 in each account...");
        account1.Deposit(2000);
        account2.Deposit(2000);
        account3.Deposit(2000);

        // חשבונות עם יתרה מעל 1000
        if (account1.GetCurrentBalance() > 1000) {
            System.out.println("Account 1 has more than 1000 in its balance");
        }

        // יתרות נוכחיות
        System.out.println("\nCurrent Balance in account number 3(Premium) is " + account3.GetCurrentBalance());
        System.out.println("Current Balance in account number 1(Standard) is " + account1.GetCurrentBalance());

        // סגירת כל החשבונות
        System.out.println("\nClosing all bank accounts...");
        bank.CloseAccount(1);
        bank.CloseAccount(2);
        bank.CloseAccount(3);
        System.out.println("There are " + bank.GetAllAccounts().size() + " accounts in the bank");
    }
}

