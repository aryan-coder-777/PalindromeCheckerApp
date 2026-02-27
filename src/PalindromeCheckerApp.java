import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        boolean result = check(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Is Palindrome? : true");
        } else {
            System.out.println("Is Palindrome? : false");
        }

        scanner.close();
    }

    /**
     * Recursively checks whether a string is palindrome
     */
    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }
}