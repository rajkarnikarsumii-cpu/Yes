import java.util.Scanner;

/**
 * Write a description of class Positive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Positive
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        if (num>0)
        {
            System.out.println("The number is positive");
        }
        else if (num<0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is zero");
        }
        }
        }