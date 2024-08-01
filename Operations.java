public class Operations {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operations
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Relational Operations
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);

        // Logical Operations
        boolean andOperation = (a > 0 && b > 0);
        boolean orOperation = (a > 0 || b > 0);
        boolean notOperation = !(a > b);

        // Assignment Operations
        int c = 7;
        c += 3; // Equivalent to c = c + 3;
        c -= 2; // Equivalent to c = c - 2;
        c *= 4; // Equivalent to c = c * 4;
        c /= 2; // Equivalent to c = c / 2;
        c %= 3; // Equivalent to c = c % 3;

        // Increment and Decrement Operations
        int increment = a++;
        int decrement = b--;

        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.println("\nRelational Operations:");
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreater);
        System.out.println("a < b: " + isLess);
        System.out.println("a >= b: " + isGreaterOrEqual);
        System.out.println("a <= b: " + isLessOrEqual);

        System.out.println("\nLogical Operations:");
        System.out.println("(a > 0 && b > 0): " + andOperation);
        System.out.println("(a > 0 || b > 0): " + orOperation);
        System.out.println("!(a > b): " + notOperation);

        System.out.println("\nAssignment Operations:");
        System.out.println("c after assignment operations: " + c);

        System.out.println("\nIncrement and Decrement Operations:");
        System.out.println("Value of a after increment: " + increment);
        System.out.println("Value of b after decrement: " + decrement);
    }
}
