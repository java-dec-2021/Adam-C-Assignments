import java.util.Random;

public class BankAccount {
    // Member Variables
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    private static double bankBalance = 0.00;
    private static int numberOfAccounts = 0;
    private String accountID;

    // Initialize randMachine to allow us to call methods from Random.
    // Then generate a random password
    Random randMachine = new Random();
    // Get a random letter of the alphabet
    public char getRandomLetter() {
        char[] alphabet = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        return alphabet[randMachine.nextInt(26)];
    }
    // Generate an 10 character password containing alphabet characters
    public String generatePassword() {
        char[] passwordChars = new char[10];
        for (int i=0;i<passwordChars.length;i++) {
            passwordChars[i] = getRandomLetter();
        }
        // Returns password chars after converting them to a string
        return new String(passwordChars);
    }

    // Constructors
    public BankAccount() {
        this.accountID=generatePassword();
        numberOfAccounts++;
    }

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.accountID=generatePassword();
        numberOfAccounts++;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        bankBalance += checkingBalance + savingsBalance;
    }

    // GETTERS (No Setters)
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
    public static double getBankBalance() {
        return bankBalance;
    }
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    public String getAccountID() {
        return accountID;
    }

    // METHODS
    // Deposit given checking,savings amounts into account
    // First check to make sure not depositing a negative value
    public void deposit(double checking, double savings) {
        if (checking < 0 || savings < 0) {
            System.out.println("You can't deposit negative amounts. Please try again.");
            return;
        } else {
            this.checkingBalance += checking;
            this.savingsBalance += savings;
            bankBalance += checking + savings;
            System.out.println("Deposit Successful.");
        }
    }

    // Withdraw from checking,savings by a specified amount
    // Check to make sure that there is enough in the account before withdrawal
    // Also check to make sure not withdrawing a negative value
    public void withdraw(double checking, double savings) {
        if (checking < 0 || savings < 0) {
            System.out.println("You can't withdraw negative amounts. Please try again.");
            return;
        } else if (this.checkingBalance - checking < 0 || this.savingsBalance - checking < 0) {
            System.out.println("You can't withdraw that amount due to Insufficient Funds. Please try again.");
            return;
        } else {
            this.checkingBalance -= checking;
            this.savingsBalance -= savings;
            double withdrawalTotal = checking + savings;
            bankBalance -= withdrawalTotal;
            System.out.println("Withdrawal Successful.");
        }
    }

    // Print checking and savings balances to terminal
    public void displayAccountBalances() {
        System.out.println("Checking: " + this.checkingBalance + " Savings: " + this.savingsBalance);
    }
}