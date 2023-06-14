
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int givenPoints = Integer.valueOf(scan.nextLine());
        if (givenPoints > 100) {
            System.out.println("Grade: incredible!");
        } else if (givenPoints > 89) {
            System.out.println("Grade: 5");
        } else if (givenPoints > 79) {
            System.out.println("Grade: 4");
        }else if (givenPoints > 69) {
            System.out.println("Grade: 3");
        }else if (givenPoints > 59) {
            System.out.println("Grade: 2");
        }else if (givenPoints > 49) {
            System.out.println("Grade: 1");
        }else if (givenPoints > -1) {
            System.out.println("Grade: failed");
        }else {
            System.out.println("Grade: impossible!");
        }
    }
}
