import java.util.Scanner;

public class InputTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer value
        int intValue = scanner.nextInt();

        // Read double value
        double doubleValue = scanner.nextDouble();

        // Read boolean value
        boolean booleanValue = scanner.nextBoolean();

        // Consume the remaining newline character
        scanner.nextLine(); // This is necessary to move to the next line

        // Read string value
        String stringValue = scanner.nextLine();

        // Print the values
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("String: " + stringValue);

        // Close the scanner
        scanner.close();
    }
}
