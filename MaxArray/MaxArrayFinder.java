// Package declaration
package MaxArray;

// Importing Scanner class from java.util package
import java.util.Scanner;

// Class declaration
public class MaxArrayFinder {
    // Main method
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Clearing the terminal
        System.out.print("\033\143");
        
        // Prompting the user to enter the size of the array
        System.out.print("Enter the size of the array: ");

        
        // Reading the size of the array from the user
        int size = scanner.nextInt();

        if (size <= 0){
            System.out.println("Invalid array size. Please enter postive integer.");
            System.exit(1);
        }
        
        // Creating an array to hold the elements entered by the user
        int array[] = new int[size];
        
        // Prompting the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
   
        // Looping to read the elements of the array from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        // // Closing the Scanner object to avoid resource leak
        scanner.close();

        // int [] array = {1,23,4,3}; 

        // Printing a blank line and separator before displaying the array
        System.out.println("");
        System.out.println("*******************************************************************************************************");
        System.out.print("Array: [");
        
        // Printing the elements of the array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i< array.length ) {
                System.out.print(", ");    
            }
        }
        
        // Printing the end of the array and a separator
        System.out.println("]");
        System.out.println("*******************************************************************************************************");
        
        // Finding the maximum value in the array
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            
        }
        // Printing the maximum value
        System.out.println("");
        System.out.println("Maximum element: " + max + ", First Element:" + array[0] + ", Last Element: " + array[size-1]);

    }
}
