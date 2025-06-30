import java.util.Scanner;

public class CountCharactersWithArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String password = sc.nextLine();

        char[] chars = password.toCharArray();

        int letters = 0;
        int digits = 0;
        int symbols = 0;

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            // Check if it's a letter
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                letters++;
            }
            // Check if it's a digit
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            // Otherwise, it's a symbol
            else {
                symbols++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Symbols: " + symbols);

    }
}