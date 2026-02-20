import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 6.0");
        System.out.println("System initialized successfully.\n");

        // UC6 - Queue + Stack Fairness Check
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert each character into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare until queue becomes empty
        while (!queue.isEmpty()) {

            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}