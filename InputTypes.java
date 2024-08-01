import java.util.Scanner;

public class InputTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        boolean booleanValue = scanner.nextBoolean();
        scanner.nextLine();
        String stringValue = scanner.nextLine();
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("String: " + stringValue);
        scanner.close();
    }
}
