
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int countEven = 0;
        int countOdd = 0;

        System.out.println("Give numbers:");
        while (true) {


            int givenNumber = scanner.nextInt();
            if (givenNumber == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (givenNumber > 0) {
                sum = sum + givenNumber;
                count++;
            }
            if (givenNumber < 0 && givenNumber != -1) {
                count++;
            }

            if (givenNumber % 2 ==0) {
                countEven++;
            } else {
                countOdd++;
            }


        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (1.0 * sum / count));
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    }
}

