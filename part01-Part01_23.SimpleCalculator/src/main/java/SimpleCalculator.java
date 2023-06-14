
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber-secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber*secondNumber));
        if (secondNumber==0) {
            System.out.println("Dividing by zero is typically not permitted.");
        } else
        System.out.println(firstNumber + " / " + secondNumber + " = " + (1.0 * firstNumber /secondNumber));
    }
}
