// Superclass with method overloading
class Calculator {

    // Method for adding two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for adding three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method for adding two doubles
    double add(double a, double b) {
        return a + b;
    }
}

// Subclass that overrides a method from the superclass
class AdvancedCalculator extends Calculator {

    // Overriding the add method from Calculator class
    @Override
    int add(int a, int b) {
        System.out.println("AdvancedCalculator add method called.");
        return a + b + 10; // Adding an extra value for demonstration
    }

    // New method specific to AdvancedCalculator
    int multiply(int a, int b) {
        return a * b;
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        // Demonstrating method overloading
        Calculator calc = new Calculator();
        System.out.println("Sum of 10 and 20: " + calc.add(10, 20));         // Calls the first add method
        System.out.println("Sum of 10, 20, and 30: " + calc.add(10, 20, 30)); // Calls the second add method
        System.out.println("Sum of 10.5 and 20.5: " + calc.add(10.5, 20.5)); // Calls the third add method

        // Demonstrating method overriding
        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println("Sum of 10 and 20 (AdvancedCalculator): " + advCalc.add(10, 20)); // Calls the overridden add method
        System.out.println("Multiplication of 5 and 6: " + advCalc.multiply(5, 6)); // Calls the multiply method
    }
}
