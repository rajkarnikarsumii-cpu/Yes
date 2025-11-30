import java.util.Scanner;

/**
 * Write a description of class OddEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddEven
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        if(num % 2==0){
            System.out.println("The number is even");
        }
        else
            {
                System.out.println("The number is odd");
            }
        }
        
    }