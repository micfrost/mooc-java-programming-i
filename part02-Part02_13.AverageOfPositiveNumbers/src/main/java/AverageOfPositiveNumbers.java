
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int inputTimes = 0;



        while (true) {
            System.out.println("Give a number: ");
            int givenNumber = Integer.valueOf(scanner.nextLine());

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

            System.out.println("Average of the numbers: " + (1.0*sum / inputTimes));
        }
    }
}
