/*The program below writes a method that asks user to enter the year by use of the scanner object, the program then checks if  the year is a leap year, 
and outputs the text "The year you entered is a leap year" if it is a leap year.Else it prints "The year you entered is not a leap year".

The program also to creates a java project, a package and a class, in the class, where it calculates the area of a triangle. The program uses three 
non-static methods:
1)Asks the user to enter the base and the height of a triangle.
2)Computes the area of the rectangle.
3)Outputs the calculated area of the triangle and displays it to the user.
*/

// Declares the package for this class
package leapyear.triangle;

import java.util.Scanner;

public class Triangle {

    private double base;
    private double height;

// Method to check if the year is a leap year
    public void checkLeapYear() {

// Creates a scanner object for user input
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = userinput.nextInt();
        
// Check if the year is a leap year
        if (year % 4 == 0) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }
    }

// Method to ask the user to enter the base and height of the triangle
    public void inputTriangleDimensions() {
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base = userinput.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = userinput.nextDouble();
    }

// Method to compute the area of the triangle
    public double computeArea() {
        return 0.5 * base * height;
    }

// Method to output the calculated area of the triangle
    public void displayArea() {
        double area = computeArea();
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {

// Create an instance of Calculator
        Triangle calculator = new Triangle();
        
// Calls the method to check leap year
        calculator.checkLeapYear();
        
// Calls the methods to input dimensions, compute, and display the area
        calculator.inputTriangleDimensions();
        calculator.displayArea();
    }
}
