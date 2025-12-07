import java.util.Scanner;

/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean continueCalculation = true;
    while (continueCalculation) {
    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();
    System.out.print("Choose an operation (+, -, *, /): ");
    char operation = scanner.next().charAt(0);
    double result = 0;
    boolean validOperation = true;
    switch (operation) {
    case '+':
    result = num1 + num2;
    break;
    case '-':
    result = num1 - num2;
    break;
    case '*':
    result = num1 * num2;
    break;
    case '/':
    if (num2 != 0) {
        result = num1 / num2;
    } else {
        System.out.println("Error: Division by zero!");
        validOperation = false;
    }
    break;
    default:
        System.out.println("Invalid operation!");
        validOperation = false;
    }

    if (validOperation) {
        System.out.println("Result: " + result);
    }
    
    System.out.print("Do you want to perform another calculation? (true/false): ");
    continueCalculation = scanner.nextBoolean();
}
System.out.println("Calculator exited.");
}
}





        