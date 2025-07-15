

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start and end range: ");
		int a = sc.nextInt();
		int c = sc.nextInt();

		for (int num = a; num <= c; num++) {
			if (num < 2) {
				// Numbers less than 2 are neither prime nor composite
				continue;
			}

			boolean isPrime = true; // Assume the number is prime

			// Check divisibility from 2 to num/2
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break; // Not prime, exit loop
				}
			}

			if (isPrime) {
				System.out.print(num + " ");
			}

		}
	}
}
