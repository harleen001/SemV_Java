// Class with overloaded constructors
class Rectangle {
    // Instance variables
    private int length;
    private int width;

    // Default constructor
    Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Parameterized constructor for length and width
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Parameterized constructor for creating a square
    Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    // Method to calculate area
    int getArea() {
        return length * width;
    }

    // Method to display rectangle properties
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea());
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        // Create objects using different constructors
        Rectangle rect1 = new Rectangle(); // Default constructor
        Rectangle rect2 = new Rectangle(5, 10); // Parameterized constructor
        Rectangle square = new Rectangle(7); // Parameterized constructor for square

        // Display properties of the rectangles
        System.out.println("Rectangle 1:");
        rect1.display(); // Length: 1, Width: 1, Area: 1

        System.out.println("\nRectangle 2:");
        rect2.display(); // Length: 5, Width: 10, Area: 50

        System.out.println("\nSquare:");
        square.display(); // Length: 7, Width: 7, Area: 49
    }
}
