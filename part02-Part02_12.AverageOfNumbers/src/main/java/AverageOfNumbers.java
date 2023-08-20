
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double inputTimes = 0;

        double ave;

        while (true) {
            System.out.println("Give a number: ");
            double givenNumber = Double.valueOf(scanner.nextLine());

            if (givenNumber == 0) {
                break;
            }

            inputTimes++;
            sum = sum + givenNumber;


        }
        ave = sum / inputTimes * 1.0;
        System.out.println("Average of the numbers: " + ave);

    }
}
