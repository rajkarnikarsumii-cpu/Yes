import java.util.Scanner;

/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Enter a number:");
        int reverse=0;
        int original = num;
        while (num!=0){
        int digit = num%10;
        reverse = reverse * 10 + digit;
        num /=10;   
    }
    System.out.println("The original number is:" +original);
    System.out.println("The reversed number is:" +reverse);
}
}
