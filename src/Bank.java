import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    private List<IAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    @Override
    public void OpenAccount(IAccount account) {
        accounts.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        IAccount accountToRemove = null;
        for (IAccount account : accounts) {
            if (account.GetAccountNumber() == accountNumber) {
                if (account.GetCurrentBalance() < 0) {
                    System.out.println("Cannot close account due to negative balance.");
                } else {
                    accountToRemove = account;
                }
                break;
            }
        }
        if (accountToRemove != null) {
            accounts.remove(accountToRemove);
        }
    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> accountsInDebt = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() < 0) {
                accountsInDebt.add(account);
            }
        }
        return accountsInDebt;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balance) {
        List<IAccount> accountsWithBalance = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() > balance) {
                accountsWithBalance.add(account);
            }
        }
        return accountsWithBalance;
    }
}
