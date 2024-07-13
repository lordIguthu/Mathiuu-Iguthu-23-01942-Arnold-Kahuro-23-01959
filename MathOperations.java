/*The java program below consists of one non-static method, two static methods and a constructor.With the use of the above features,
the program is able to calculate the sum of two numbers, the difference as well as identifying the largest number in a series of numbers*/

public class MathOperations {

//Variable diclaration
    private int FirstNum;
    private int SecondNum;

//Constructor to initialize the object with two numbers
    public MathOperations(int FirstNum, int SecondNum) {
        this.FirstNum = FirstNum;
        this.SecondNum = SecondNum;
    }

//Non-static method to calculate the sum of FirstNum and SecondNum
    public int calculateSum() {
        return FirstNum + SecondNum;
    }

//Static method to calculate the absolute difference between two numbers
    public static int absoluteDifference(int FirstNum, int SecondNum) {
        return Math.abs(FirstNum - SecondNum);
    }

//Static method to find the larger number between two numbers
    public static int findLargest(int FirstNum, int SecondNum) {
        return Math.max(FirstNum, SecondNum);
    }

    public static void main(String[] args) {

//Creates an object of MathOperations
        MathOperations math = new MathOperations(10, 20);

//Calls the non-static method on the object
        int sum = math.calculateSum();
        System.out.println("The sum of " + math.FirstNum + " and " + math.SecondNum + " is: " + sum);

//Calls the static methods directly
        int difference = absoluteDifference(30, 15);
        int largest = findLargest(5, 8);
        System.out.println("The absolute difference between 30 and 15 is: " + difference);
        System.out.println("The largest number between 5 and 8 is: " + largest);
    }
}
