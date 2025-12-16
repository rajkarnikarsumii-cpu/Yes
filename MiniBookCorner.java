
/**
 * Write a description of class MiniBookCorner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniBookCorner
{
    public static void main(String[] args) {
        String[] categories = {"Fiction", "Nepali"};
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        titles[0][0] = "The Swan";
        prices[0][0] = 850.00;

        titles[1][0] = "Asahamati - 5";
        prices[1][0] = 750.00;

        for (int i = 0; i < titles.length; i++) {
            System.out.println("Category: " + categories[i]);
            String bookTitle = titles[i][0];
            double bookPrice = prices[i][0];
            System.out.println("Title: " + bookTitle);
            System.out.println("Price: " + bookPrice);
            System.out.println();
    }
}
}