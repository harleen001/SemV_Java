import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double add = num1 + num2;
        double subtract = num1 - num2;
        double multiplication = num1 * num2;
        double divide = num1 / num2;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + divide);

        scanner.close();
    }
}
