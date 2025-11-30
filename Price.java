import java.util.Scanner;

/**
 * Write a description of class Price here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Price
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double price=90;
        double sp=0;
        double discount=0;
        System.out.println("Choose category");
        char category = scan.next().charAt(0);
        if (category=='A'){
            sp=price-(price*0.60);
        }
        else if (category=='B'){
             sp=price-(price*0.40);
        }
        else if (category=='C'){
             sp=price-(price*0.20);
        }
        else if (category=='D'){
             sp=price-(price*0.10);
        }
       
        System.out.println("Category=" +category);
        System.out.println("Selling Price=" +sp);
        
        }
    }