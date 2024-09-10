public class StringOperations {

    public static void main(String[] args) {
        // Define two example strings
        String str1 = "Harleen_Singh";
        String str2 = "Imanpal_Singh";
        
        // 1. Compare two strings
        compareStrings(str1, str2);
        
        // 2. Count the length of a string
        countStringLength(str1);
        
        // 3. Convert uppercase to lowercase and vice versa
        convertCase(str1);
        
        // 4. Concatenate two strings
        concatenateStrings(str1, str2);
        
        // 5. Print a substring
        printSubstring(str1, 6, 11); // Prints substring from index 6 to 10
    }

    // Method to compare two strings
    public static void compareStrings(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }

    // Method to count the length of a string
    public static void countStringLength(String str) {
        System.out.println("The length of the string \"" + str + "\" is: " + str.length());
    }

    // Method to convert uppercase to lowercase and vice versa
    public static void convertCase(String str) {
        String upperCase = str.toUpperCase();
        String lowerCase = str.toLowerCase();
        System.out.println("Original String: " + str);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
    }

    // Method to concatenate two strings
    public static void concatenateStrings(String s1, String s2) {
        String concatenated = s1.concat(s2);
        System.out.println("Concatenated String: " + concatenated);
    }

    // Method to print a substring
    public static void printSubstring(String str, int start, int end) {
        if (start < 0 || end > str.length() || start > end) {
            System.out.println("Invalid substring range.");
            return;
        }
        String substring = str.substring(start, end);
        System.out.println("Substring from index " + start + " to " + (end - 1) + ": " + substring);
    }
}
