public class TestBank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(10000,25000);
        account1.displayAccountBalances();

        account1.deposit(500,-500);
        account1.deposit(500,200);
        account1.displayAccountBalances();

        BankAccount account2 = new BankAccount();
        account2.withdraw(100,100);
        account1.withdraw(100,-100);
        account1.withdraw(1000,1000);
        account1.displayAccountBalances();
    
        System.out.println(BankAccount.getNumberOfAccounts());
        System.out.println(BankAccount.getBankBalance());
        System.out.println(account1.getAccountID());
    }
}
