/*Create a program using Java programming language that will read 2 inputs and print the maximum number of 2 values.

Note: Using java max method is prohibited

----------------------------------------
Test Case 1:
First Input: 10
Second Input: 15

Expected output: The max value is 15.


Test Case 2:
First Input: 20
Second Input: 15

Expected output: The max value is 20.


Test Case 3:
First Input: 15
Second Input: 15

Expected output: Inputs are equal.
*/
package max;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int firstNum;
        int secondNum;

        Scanner input = new Scanner(System.in);

        System.out.print("First input: "); // Prompting the user to enter a number
        firstNum = input.nextInt(); // Reading the user input and storing it in the variable 'firstNum'

        System.out.print("Second input: "); // Prompting the user to enter a number
        secondNum = input.nextInt(); // Reading the user input and storing it in the variable 'seconodNum'

        if (firstNum > secondNum) {
            System.out.printf("The max value is %d.", firstNum); // Printing a message indicating that the first number
                                                                 // is //Max value

        } else if (firstNum < secondNum) {
            System.out.printf("The max value is %d.", secondNum); // Printing a message indicating that the first second
                                                                  // is //Max value

        } else if (firstNum == secondNum) {
            System.out.printf("Inputs are equal."); // Printing a message indicating that the first number and second
                                                    // value is equal
        }
    }
}