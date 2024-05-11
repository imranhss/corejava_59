
package testabstractclass59;

import account.BankAccount;
import account.CheckingAccount;
import account.SavingsAccount;


public class BankAccMain {
    
    
    public static void main(String[] args) {
        
        BankAccount savingsAccount=new SavingsAccount(1000, .05);
        BankAccount checkingAccount=new CheckingAccount(2000, 500, 10);
        
        // Performing operations on SavingsAccount
        System.out.println("Savings Account:");
        System.out.println("Initial Balance: " + savingsAccount.balance);
        savingsAccount.deposit(500);
        System.out.println("Balance after deposit: " + savingsAccount.balance);
        savingsAccount.withdraw(200);
        System.out.println("Balance after withdrawal: " + savingsAccount.balance);
        System.out.println("Interest earned: " + savingsAccount.calculateInterest());

        // Performing operations on CheckingAccount
        System.out.println("\nChecking Account:");
        System.out.println("Initial Balance: " + checkingAccount.balance);
        checkingAccount.deposit(1000);
        System.out.println("Balance after deposit: " + checkingAccount.balance);
        checkingAccount.withdraw(300);
        System.out.println("Balance after withdrawal within limit: " + checkingAccount.balance);
        checkingAccount.withdraw(700);
        System.out.println("Balance after withdrawal beyond limit: " + checkingAccount.balance);
        
    }
    
}
