import com.example.utils.Calculator;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Calculator from the package
        Calculator calc = new Calculator();
        
        // Use the Calculator methods
        int sum = calc.add(10, 5);
        int difference = calc.subtract(10, 5);
        int product = calc.multiply(10, 5);
        double quotient = calc.divide(10, 5);
        
        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
