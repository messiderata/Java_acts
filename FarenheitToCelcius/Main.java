/*
Description: This program converts temperature from Fahrenheit to Celsius.
*/

package FarenheitToCelcius;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double fahrenheit;
        Scanner input = new Scanner(System.in);

        System.out.print("Fahrenheit: "); // Prompting the user to enter the temperature in Fahrenheit
        fahrenheit = input.nextInt(); // Reading the user input and storing it in the variable 'fahrenheit'

        double celsius = (fahrenheit - 32) * 5 / 9; // Convert Fahrenheit to Celsius

        System.out.println("Celsius: " + celsius); // Display the temperature in Celsius
    }
}
