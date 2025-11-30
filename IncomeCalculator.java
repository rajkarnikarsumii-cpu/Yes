import java.util.Scanner;

/**
 * Write a description of class IncomeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IncomeCalculator
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter annual income (NPR):");
        double annualIncome = scan.nextDouble();
        double taxpayable=0;
        if (annualIncome <= 500000) {
            taxpayable = 0.01 * annualIncome;
        }
        else if (annualIncome <=700000) {
            taxpayable = 5000 + 0.10 * (annualIncome - 500000);
        }
        else if (annualIncome <= 1000000) {
            taxpayable = 15000 + 0.20 * (annualIncome - 700000);
        }
        else if (annualIncome <= 2000000) {
            taxpayable = 35000 + 0.30 * (annualIncome - 1000000);
        }
        else if (annualIncome <= 5000000) {
            taxpayable = 335000 + 0.36 * (annualIncome - 35000);
        }
        else {
            taxpayable = 1135000 + 0.39 * (annualIncome - 5000000);
        }
        System.out.println ("Tax Payable:" +taxpayable + "NPR");
    }
        }
        