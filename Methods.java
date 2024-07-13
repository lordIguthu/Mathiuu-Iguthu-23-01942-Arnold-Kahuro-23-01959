/*The program below creates a java project named methods_in_java,  it creates a package named java_methods within the project and in the package, creates
a class named methods.The Program incorporates the scanner metod to accept user input where it receives 3 random numbers.It then uses if statements to 
determine the largest and smallest numbers of the three given before printing them out.*/

// Declares the package for this class
package java_methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

// Creates a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
// Asks the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
// Determines the largest and smallest numbers
        int largest, smallest;
        
// Finds the largest number
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        
// Finds the smallest number
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }
        
// Prints out the results
        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " is your smallest number.");
        
    }
}
