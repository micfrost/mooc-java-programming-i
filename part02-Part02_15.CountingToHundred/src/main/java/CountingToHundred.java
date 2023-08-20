
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int givenInput = scanner.nextInt();

        for (int i=givenInput;i<=100;i++) {
            System.out.println(i);
        }

    }
}
