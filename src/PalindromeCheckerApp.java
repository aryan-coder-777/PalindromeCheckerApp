import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Convert to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the LinkedList
        for (char ch : input.toCharArray()) {
            list.add(ch);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare first and last characters until list is empty or one element left
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}