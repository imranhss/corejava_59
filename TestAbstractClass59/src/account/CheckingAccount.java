/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

/**
 *
 * @author user
 */
public class CheckingAccount extends BankAccount {

    private double withdrawalLimit;
    private double fee;

    public CheckingAccount(double initialBalance, double withdrawalLimit, double fee) {
        this.balance = initialBalance;
        this.withdrawalLimit = withdrawalLimit;
        this.fee = fee;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            balance -= amount;
        } else {
            balance -= amount + fee;
        }
    }

    @Override
    public double calculateInterest() {

        return 0.0;
    }
}
