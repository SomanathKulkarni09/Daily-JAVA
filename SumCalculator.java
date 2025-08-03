import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for two numbers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Calculate and display the sum
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        input.close();
    }
}
