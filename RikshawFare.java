import java.util.Scanner;

/**
 * Write a description of class RikshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RikshawFare
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your distance in (km)");
        double km = scan.nextDouble();
        System.out.println("Enter your travel time (minutes)");
        double time = scan.nextDouble();
        double basefare = 40;
        double perkm = 25;
        double permin = 1.5;
        double cost = basefare+(km*perkm)+(permin*time);
        System.out.println("The cost is" +cost);
        System.out.println("Are you a local(true or false)");
        boolean local = scan.nextBoolean();
        double a = (local=true)?cost-cost*0.10 : cost;
        
        System.out.println("Is it at night(true or false)");
        boolean night = scan.nextBoolean();
        double finalcost = (night=true)? a+a*10 : a;
        System.out.println("The final cost is" +finalcost);
        
    }
    }