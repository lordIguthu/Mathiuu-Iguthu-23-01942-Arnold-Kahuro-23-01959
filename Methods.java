/*The program below creates a java project named methods_in_java,  it creates a package named java_methods within the project and in the package, creates
a class named methods.The Program incorporates the scanner metod to accept user input where it receives 3 random numbers.It then uses if statements to 
determine the largest and smallest numbers of the three given before printing them out.*/

// Declares the package for this class
package java_methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

// Creates a scanner object for user input
        Scanner RandomDigits = new Scanner(System.in);
        
// Asks the user to enter three numbers
        System.out.print("Enter the first number: ");
        int FirstNum = RandomDigits.nextInt();
        System.out.print("Enter the second number: ");
        int SecondNum = RandomDigits.nextInt();
        System.out.print("Enter the third number: ");
        int ThirdNum = RandomDigits.nextInt();
        
// Determines the largest and smallest numbers
        int largest, smallest;
        
// Finds the largest number
        if (FirstNum >= SecondNum && FirstNum >= ThirdNum) {
            largest = FirstNum;
        } else if (SecondNum >= FirstNum && SecondNum >= ThirdNum) {
            largest = SecondNum;
        } else {
            largest = ThirdNum;
        }
        
// Finds the smallest number
        if (FirstNum <= SecondNum && FirstNum <= ThirdNum) {
            smallest = FirstNum;
        } else if (SecondNum <= FirstNum && SecondNum <= ThirdNum) {
            smallest = SecondNum;
        } else {
            smallest = ThirdNum;
        }
        
// Prints out the results
        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " is your smallest number.");
        
    }
}
