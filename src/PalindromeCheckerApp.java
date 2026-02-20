public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 3.0");
        System.out.println("System initialized successfully.\n");

        // UC3 - Reverse String Based Palindrome Check
        String input = "madam";
        String reversed = "";

        // Iterate from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }
    }
}