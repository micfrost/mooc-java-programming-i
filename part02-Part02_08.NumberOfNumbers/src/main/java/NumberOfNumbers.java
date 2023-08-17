
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        int givenNumber;

        do {
            System.out.println("Give a number: ");
            givenNumber = scanner.nextInt();
            count++;
            if (givenNumber == 0) {
                count--;
            }
        }
        while (givenNumber != 0);

        System.out.println("Number of numbers: " + count);

    }
}
