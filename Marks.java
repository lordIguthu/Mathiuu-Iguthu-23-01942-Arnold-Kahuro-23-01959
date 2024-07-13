/*The program below creates a java project, package and class. It incorporates a method within the class that asks a lecturer to enter marks for three units,
java programming, networking and maths.It then computes the average marks for three units and outputs the data in the specified format.*/

// Declares the package for this class
package marks_package; 

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {

// Creates a scanner object for user input
        Scanner UnitMarks = new Scanner(System.in);

// Asks the lecturer to enter the marks for three units
        System.out.print("Enter marks for Java Programming: ");
        int javaMarks = UnitMarks.nextInt();
        System.out.print("Enter marks for Networking: ");
        int networkingMarks = UnitMarks.nextInt();
        System.out.print("Enter marks for Maths: ");
        int mathsMarks = UnitMarks.nextInt();

// Calculates the average marks
        double averageMarks = (javaMarks + networkingMarks + mathsMarks) / 3.0;

// Prints out the results
        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);
    }
}
