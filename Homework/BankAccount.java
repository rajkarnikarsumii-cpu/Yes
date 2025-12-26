package Homework;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int accountNumber;
    String holderName;
    double balance;
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited New balance: " + balance);
             System.out.println("Deposited New balance: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public void withdraw(double amount) {
        if(amount > 0) {
            if(amount <= balance) {
                balance = balance - amount;
                System.out.println(amount + " withdrawn New balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    
    public void displayBalance() {
        System.out.println(accountNumber);
        System.out.println(holderName);
        System.out.println(balance);
    }
}
