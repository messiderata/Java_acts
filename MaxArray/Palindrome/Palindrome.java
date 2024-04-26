package MaxArray.Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Clear the console
        System.out.print("\033\143");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store the original word and its reverse
        String original, reverse = "";

        // Prompt the user to enter a word
        System.out.print("Enter your word: ");
        original = scanner.nextLine().toLowerCase();
        scanner.close(); // Close the scanner to prevent resource leak

        // Get the length of the input word
        int length = original.length();

        // Iterate over the characters of the original word in reverse order and build
        // the reverse string
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        // Check if the original word is equal to its reverse to determine if it's a
        // palindrome
        if (reverse.equals(original)) {
            // Print the original word and indicate that it's a palindrome
            System.out.println("\"" + original + "\" " + "(Palindrome)");
        } else {
            // Print the original word and indicate that it's not a palindrome
            System.out.println("\"" + original + "\" " + "(Not a Palindrome)");
        }
    }
}
