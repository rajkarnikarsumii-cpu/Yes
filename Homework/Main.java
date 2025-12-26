package Homework;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(101, "Alice", 5000);
        BankAccount account2 = new BankAccount(102, "Bob", 3000);

        account1.deposit(2000);    
        account1.withdraw(1000);  
        
        account2.deposit(1500);   
        account2.withdraw(500);    

        System.out.println("Final Account Balances:");
        account1.displayBalance();
        account2.displayBalance();
    }
}
