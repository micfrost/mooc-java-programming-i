
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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

            if (givenNumber>0) {
                inputTimes++;
                sum = sum + givenNumber;
            }



        }
        if (inputTimes==0) {
            System.out.printf("Cannot calculate the average");
        } else {
            ave = sum / inputTimes * 1.0;
            System.out.println("Average of the numbers: " + ave);
        }
    }
}
