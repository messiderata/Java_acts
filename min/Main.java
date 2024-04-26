package min;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int firstNum;
        int secondNum;

        Scanner input = new Scanner(System.in);

        System.out.print("First input: "); // Prompting the user to enter a number
        firstNum = input.nextInt(); // Reading the user input and storing it in the variable 'firstNum'

        System.out.print("Second input: "); // Prompting the user to enter a number
        secondNum = input.nextInt(); // Reading the user input and storing it in the variable 'secondNum'

        if (firstNum < secondNum) {
            System.out.printf("The min value is %d.", firstNum); // Printing a message indicating that the first number
                                                                 // is //Min value

        } else if (firstNum > secondNum) {
            System.out.printf("The min value is %d.", secondNum); // Printing a message indicating that the first second
                                                                  // is //Min value

        } else if (firstNum == secondNum) {
            System.out.printf("Inputs are equal."); // Printing a message indicating that the first number and second
                                                    // value is equal
        }
    }
}
