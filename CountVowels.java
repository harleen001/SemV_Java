import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count the vowels in the string
        int vowelCount = countVowels(input);

        // Print the result
        System.out.println("The number of vowels in the string is: " + vowelCount);

        // Close the scanner
        scanner.close();
    }

    // Method to count the number of vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        // Convert the string to lowercase to simplify comparison
        str = str.toLowerCase();
        
        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        
        return count;
    }
}
