import java.util.Scanner;

/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks");
        int grade = scan.nextInt();
        
        if (grade >=40){
        System.out.println("You have passed the examination");
    }
        else
        {
        System.out.println("You have failed the examination");
    }
    
        
    }
}