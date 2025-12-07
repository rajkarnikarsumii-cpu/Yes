import java.util.Scanner;

/**
 * Write a description of class loop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepositNIB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Enter principal amount (min Rs. 1000): Rs. ");
            double principal = scanner.nextDouble();

            System.out.print("Enter duration in years (max 5 years): ");
            int years = scanner.nextInt();

            scanner.nextLine();
            double annualRate = 0.10; 
            int compoundFrequency = 12; 
            double totalAmount = principal * Math.pow(1 + annualRate / compoundFrequency, compoundFrequency * years);

            double processingFee = 0.005 * totalAmount;
            double finalAmount = totalAmount - processingFee;

            System.out.println(finalAmount);

            System.out.print("Do you want to perform another calculation? (true/false): ");
            
            continueCalculation = scanner.nextBoolean();
        }
    }
}