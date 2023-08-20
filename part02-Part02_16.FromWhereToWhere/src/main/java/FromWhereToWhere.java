
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to?");
        int givenInput = scanner.nextInt();

        for (int i = 1; i <= givenInput; i++) {
            System.out.println(i);
        }

    }
}
