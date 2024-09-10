import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the smallest number
        int smallest = findSmallest(num1, num2, num3);

        // Print the result
        System.out.println("The smallest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + smallest);

        // Close the scanner
        scanner.close();
    }

    // Method to find the smallest number among three numbers
    public static int findSmallest(int a, int b, int c) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }
}
