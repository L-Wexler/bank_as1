public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        IAccount account1 = new BasicAccount(1, 1000);
        IAccount account2 = new PremiumAccount(2);
        IAccount account3 = new StandardAccount(3, -100);

        account1.Deposit(2000); // הפקדה לחשבון 1
        account2.Deposit(500); // הפקדה לחשבון 2
        account3.Deposit(100); // הפקדה לחשבון 3

        bank.OpenAccount(account1);
        bank.OpenAccount(account2);
        bank.OpenAccount(account3);

        System.out.println("All accounts: " + bank.GetAllAccounts());
        System.out.println("Accounts in debt: " + bank.GetAllAccountsInDebt());
        System.out.println("Accounts with balance > 1500: " + bank.GetAllAccountsWithBalance(1500));

        bank.CloseAccount(1);
        System.out.println("After closing account 1:");
        System.out.println("All accounts: " + bank.GetAllAccounts());
    }
}
