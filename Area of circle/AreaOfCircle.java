/*
Description: This activity calculates the area of a circle given its radius.
----------------------
Test Data 1:
Radius: 5

Expected Output:
Area: 78.54
----------------------
Test Data 2:
Radius: 10

Expected Output:
Area: 314.16
*/

import java.util.Scanner;//Importing the scanner class from java.util package

public class AreaOfCircle {
    public static void main(String[] args) {
        int radius; // Define variable name radius
        double area;// Define variale name area

        Scanner scanner = new Scanner(System.in); // Create scanner object to read
        System.out.print("Radius: ");// Prompting the user for enter their grade
        radius = scanner.nextInt();// Reading user input radius and store it in the variable 'radius'

        area = Math.PI * Math.pow(radius, 2);// Calculating the area of circle Formula : (A = PI*radius^2)
        System.out.printf("Area: %,.2f", area);// Printing the are with two decimal places
        System.out.println("");// Printing new line

    }
}
