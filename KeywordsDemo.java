// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Concrete class that extends the abstract class
class Dog extends Animal {
    // Implementing the abstract method
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Class demonstrating the use of 'static' and 'this'
class Demo {
    // Static variable
    static int count = 0;

    // Instance variable
    int id;

    // Constructor
    Demo(int id) {
        this.id = id;
        count++; // Increment static variable
    }

    // Static method
    static void showCount() {
        System.out.println("Total count: " + count);
    }

    // Instance method
    void showId() {
        System.out.println("Instance ID: " + this.id);
    }
}

public class KeywordsDemo {
    public static void main(String[] args) {
        // Demonstrate abstract class and method
        Animal myDog = new Dog();
        myDog.makeSound(); // The dog barks.
        myDog.sleep(); // This animal is sleeping.

        // Demonstrate static keyword
        Demo.showCount(); // Total count: 0

        Demo demo1 = new Demo(1);
        Demo demo2 = new Demo(2);

        demo1.showId(); // Instance ID: 1
        demo2.showId(); // Instance ID: 2

        // Demonstrate static method after creating instances
        Demo.showCount(); // Total count: 2
    }
}
