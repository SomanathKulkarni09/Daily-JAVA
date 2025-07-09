import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate square
        int square = number * number;

        // Output the result
        System.out.println("Square of " + number + " is: " + square);
    }
}
