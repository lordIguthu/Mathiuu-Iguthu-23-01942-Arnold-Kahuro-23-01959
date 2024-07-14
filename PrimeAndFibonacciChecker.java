/*With the application of the Prime Numbers comcept in arithmetics,this program creates a method named isPrime, which takes an integer as an argument and
returns true if the argument is a prime number, or false if otherwise. The program also writes main method that displays prime numbers between 1 to 500. 
This is achieved through the use of programming concepts such as if statements.

Apart from the Prime Numbers comcept, the program goes ahead to make use of more complex arithmetic postulations such as The Fibonacci sequence.
It blends the two concepts together, where it is able to find not just all the prime numbers within the given 4 million limit but specifically those 
within the Fibonacci sequence and calculate their sum.
*/

import java.util.Scanner;

public class PrimeAndFibonacciChecker {

//Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {

//0 and 1 are not prime numbers
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {

//If a divisor is found, the number is not a prime number
                return false; 
            }
        }

//If no divisors are found, it is a prime number
        return true;
    }

//Method to find the sum of all even-valued Fibonacci terms not exceeding four million
    public static long sumEvenFibonacciTerms(int limit) {

//First Fibonacci term
        long FirstFib = 0; 

//Second Fibonacci term
        long SecondFib = 1; 

//Sum of even Fibonacci terms
        long sum = 0; 

        while (SecondFib <= limit) {
            if (SecondFib % 2 == 0) {

//Adds the even Fibonacci term to the sum
                sum += SecondFib;
            }

//Generates the next Fibonacci term
            long next = FirstFib + SecondFib;
            FirstFib = SecondFib;
            SecondFib = next;
        }
        return sum;
    }

//Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Displays prime numbers between 1 and 500
        System.out.println("Prime numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

//Prints a newline 
        System.out.println();

//Asks the user to write a number so as to check if it is prime
        System.out.print("Enter a number to check if it is prime: ");
        int userNumber = scanner.nextInt();

//Checks if the user's number is prime and prints the result out
        boolean result = isPrime(userNumber);
        System.out.println(result);

//Calculates the sum of even-valued Fibonacci terms not exceeding four million
        int limit = 4000000; 

        long sum = sumEvenFibonacciTerms(limit);
        System.out.println("The sum of all even-valued Fibonacci terms is: " + sum);

//Closes the scanner
        scanner.close();
    }
}
