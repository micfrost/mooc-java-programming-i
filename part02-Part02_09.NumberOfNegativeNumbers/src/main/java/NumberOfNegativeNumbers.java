import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.println("Give a number: ");
            int givenNumber = Integer.valueOf(scanner.nextLine());

            if (givenNumber == 0) {
                break;
            }
            if (givenNumber < 0) {
                count++;
            }

        }
        System.out.println("Number of negative numbers: " + count);


    }
}
