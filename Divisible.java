import java.util.Scanner;

/**
 * Write a description of class Divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Divisible
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%3==0)
        {
            if(num%5==0)
            {
            
            System.out.println("The number is divisible by both 3 and 5");
        }
            else
            {
                System.out.println("The number is not divisible by both 3 and 5");
            }
        }
        
    }
}