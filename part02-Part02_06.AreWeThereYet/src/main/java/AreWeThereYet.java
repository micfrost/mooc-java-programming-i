
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true && true) {
            System.out.println("Give a number");
            int givenNumber = Integer.valueOf(scanner.nextLine());
            if (givenNumber == 4) {
                break;
            }
        }
    }
}
