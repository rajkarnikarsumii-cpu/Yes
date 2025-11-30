import java.util.Scanner;

/**
 * Write a description of class MRP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GPA
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your GPA");
        double gpa = scan.nextDouble();
        if(gpa>=4.0 && gpa<=3.6){
            System.out.println("Your GPA is A+");
        }
        else if(gpa>=3.6 && gpa<=3.2){
            System.out.println("Your GPA is A");
        }
        else if(gpa>=3.2 && gpa<=2.8){
            System.out.println("Your GPA is B+");
        }
        else if(gpa>=2.8 && gpa<=2.4){
            System.out.println("Your GPA is B");
        }
        else if(gpa>=2.4 && gpa<=2.0){
            System.out.println("Your GPA is C+");
        }
        else if(gpa>=2.0 && gpa<=1.6){
            System.out.println("Your GPA is C");
        }
        else if(gpa>=1.6 && gpa<=0.0){
            System.out.println("Error");
        }
        }
    }
