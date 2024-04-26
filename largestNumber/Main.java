
/*
Write a Java program that will takes three numbers from the user and prints the greatest number.

Test Data:

Input the first number: 25
Input the second number: 87
Input the third number: 50

Expected Output:
Greatest number: 87
*/

package largestNumber;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int firstNum;
        int secondNum;
        int thirdNum;

        Scanner input = new Scanner(System.in);

        System.out.print("First input: "); // Prompting the user to enter a number
        firstNum = input.nextInt(); // Reading the user input and storing it in the variable 'firstNum'

        System.out.print("Second input: "); // Prompting the user to enter a number
        secondNum = input.nextInt(); // Reading the user input and storing it in the variable 'secondNum'

        System.out.print("Third input: "); // Prompting the user to enter a number
        thirdNum = input.nextInt(); // Reading the user input and storing it in the variable 'ThirdNum'

        if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.printf("Greatest number: %d.\n", firstNum); // Printing a message indicating that the first number is greatest
                                                                   // 

        }

        else if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.printf("Greatest number: %d.\n", secondNum); // Printing a message indicating that the second number is greatest
                                                                    
        }

        else if (thirdNum > firstNum && thirdNum > secondNum) {
            System.out.printf("Greatest number: %d.", thirdNum); // Printing a message indicating that the third number is  greatest
                                                                 

        }

    }
}
