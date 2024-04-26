
/*
Create a Java program that checks whether the input is negative or positive or neutral.

----
Test Case 1
input: 5
expected output: Positive

----
Test case 2
input: -2
expected output: Negative

----
Test case 3
input: 0
expected output: Neutral


note: use Scanner class for getting the user's input
*/
package PosOrNegative;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Input: "); // Prompting the user to enter a number
        number = input.nextInt(); // Reading the user input and storing it in the variable 'number'

        if (number > 0) {
            System.out.printf("Number %d is positive.", number); // Printing a message indicating that the number is
                                                                 // positive
        } else if (number < 0) {
            System.out.printf("Number %d is negative.", number); // Printing a message indicating that the number is
                                                                 // negative
        } else {
            System.out.printf("Number %d is neutral.", number); // Printing a message indicating that the number is
                                                                // neutral
        }
    }
}
