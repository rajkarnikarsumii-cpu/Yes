import java.util.Scanner;

public class SellingPriceSwitch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float mp, discount = 0, sp;
    char category;
    System.out.print("Enter marked price: ");
    mp = sc.nextFloat();
    System.out.print("Enter category (A/B/C/D): ");
    category = sc.next().charAt(0);

    switch(category) {
    case 'A':
    case 'a':
    discount = 60;
    break;

    case 'B':
    case 'b':
    discount = 40;
    break;

    case 'C':
    case 'c':
    discount = 20;
    break;

    case 'D':
    case 'd':
    discount = 10;
    break;

    default:
    System.out.println("Invalid category!");
    return;
}
    sp = mp - (mp * discount / 100);
    System.out.println("Selling Price = " + sp);
}
}