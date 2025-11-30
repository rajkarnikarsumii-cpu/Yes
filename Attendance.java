import java.util.Scanner;

/**
 * Write a description of class Attendance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Attendance
{
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float gpa, attendance;
    int attitude;


    System.out.print("Enter GPA: ");
    gpa = sc.nextFloat();

    System.out.print("Enter attendance percentage: ");
    attendance = sc.nextFloat();

    System.out.print("Enter attitude score (1–10): ");
    attitude = sc.nextInt();

   if (gpa >= 3.2) {

   if (attendance > 80) {

   if (attitude < 5) {
   System.out.println("Student is eligible for scholarship.");
   } else {
   System.out.println("Not eligible: Attitude score must be less than 5.");
   }

   } else {
   System.out.println("Not eligible: Attendance must be greater than 80%.");
   }

   } else {
   System.out.println("Not eligible: GPA must be at least 3.2.");
   }
 }
}
