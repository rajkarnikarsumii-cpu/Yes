import java.util.Scanner;

/**
* The CinemaTicket class calculates movie ticket prices based on customer details
* using selection statements (if-else).
* This class is intended for use in the BlueJ IDE.
*/
public class CinemaTicket
{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        double basePrice = 0;
        double surcharge = 0;
        double finalPrice = 0;
        
        System.out.print("Enter customer age: ");
        int age = scanner.nextInt();
        scanner.nextLine();   
        
        
        if (age < 18) {
            basePrice = 150;
        }
        else if (age >= 60) {
            basePrice = 200;
        }
        else {
            basePrice = 250;
        }
        
       
        System.out.print("Enter movie language (Nepali, English, Hindi): ");
        String language = scanner.nextLine();
        
        if (language.equals("Hindi")) {
            surcharge = 50;
        }
        else if (language.equals("English")) {
            surcharge = 100;
        }
        else {
            surcharge = 0;
        }
        
        finalPrice = basePrice + surcharge;
        
       
        System.out.print("Are you a student? (true/false): ");
        boolean student = scanner.nextBoolean();
        
        if (student==true) {
            finalPrice = finalPrice - (finalPrice * 0.20);
        }
        
       
        System.out.print("Is it a festival day? (true/false): ");
        boolean festival = scanner.nextBoolean();
        
        if (festival==true) {
            finalPrice = finalPrice - (finalPrice * 0.15);
        }
        
        System.out.println("Final ticket price: Rs. " + finalPrice);
    }
}
