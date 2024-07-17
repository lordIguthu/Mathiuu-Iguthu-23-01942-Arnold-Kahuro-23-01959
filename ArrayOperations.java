import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];

        // a) Taking 15 integer inputs from the user and storing them in an array
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
        }

        // b) Printing the values stored in the array
        System.out.println("Values stored in the array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // c) Asking the user to enter a number and checking if it is present in the array
        System.out.println("Enter a number to search in the array:");
        int numberToSearch = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        // d) Creating another array with elements in reverse order
        int[] reversedArray = new int[15];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Elements of the new array in reverse order:");
        for (int value : reversedArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // e) Calculating and printing the sum and product of all elements in the array
        int sum = 0;
        long product = 1;  // Changed to long to handle larger products
        for (int value : array) {
            sum += value;
            product *= value;
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}
