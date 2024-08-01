import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();
        char character = input.charAt(0);
        System.out.println("You entered the character: " + character);
        scanner.close();
    }
}
