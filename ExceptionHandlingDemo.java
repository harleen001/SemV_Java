public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException (Unchecked Exception)
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: ArrayIndexOutOfBoundsException - " + e.getMessage());
        }

        // ArithmeticException (Unchecked Exception)
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Exception: ArithmeticException - Cannot divide by zero.");
        }

        // NumberFormatException (Unchecked Exception)
        try {
            String invalidNumber = "abc";
            int num = Integer.parseInt(invalidNumber);
        } catch (NumberFormatException e) {
            System.out.println("Exception: NumberFormatException - " + e.getMessage());
        }

        // IOException (Checked Exception)
        try {
            java.io.FileReader file = new java.io.FileReader("nonexistentfile.txt");
            file.close();
        } catch (java.io.IOException e) {
            System.out.println("Exception: IOException - " + e.getMessage());
        }

        // Custom Exception Handling
        try {
            checkAge(15); // This will throw a custom exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: IllegalArgumentException - " + e.getMessage());
        }
    }

    // Method to demonstrate custom exception handling
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }
}
