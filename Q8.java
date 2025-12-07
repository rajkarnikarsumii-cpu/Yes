import java.util.Scanner;

/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Enter a number");
        System.out.println("Multiplication table for:"+ number);
        for(int i =1; i<=10; i++){
            int product = number*i;
            System.out.println("The product is:" +product);
        }
    }
}