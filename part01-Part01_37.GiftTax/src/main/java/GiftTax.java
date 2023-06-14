
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int givenGift = Integer.valueOf(scan.nextLine());

        if (givenGift < 5000) {
            System.out.println("No tax!");
        } else if (givenGift < 25000) {
            System.out.println("Tax: " + (1.0 * 100 + (givenGift - 5000) * 0.08));
        } else if (givenGift < 55000) {
            System.out.println("Tax: " + (1.0 * 1700 + (givenGift - 25000) * 0.1));
        } else if (givenGift < 200000) {
            System.out.println("Tax: " + (1.0 * 4700 + (givenGift - 55000) * 0.12));
        } else if (givenGift < 1000000) {
            System.out.println("Tax: " + (1.0 * 22100 + (givenGift - 200000) * 0.15));
        } else {
            System.out.println("Tax: " + (1.0 * 142100 + (givenGift - 1000000) * 0.17));
        }
//Tax paid
    }
}
