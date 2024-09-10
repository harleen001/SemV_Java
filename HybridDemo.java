// Single Inheritance
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Multilevel Inheritance
class Bird extends Animal {
    void fly() {
        System.out.println("The bird flies.");
    }
}

class Sparrow extends Bird {
    void chirp() {
        System.out.println("The sparrow chirps.");
    }
}

// Hierarchical Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("The car drives.");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("The bike rides.");
    }
}

// Multiple Inheritance using Interfaces
interface Engine {
    void startEngine();
}

interface Fuel {
    void refuel();
}

class CarWithFeatures implements Engine, Fuel {
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void refuel() {
        System.out.println("Car refueled.");
    }
}

// Hybrid Inheritance
class HybridDemo {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat(); // Method from Animal
        dog.bark(); // Method from Dog

        // Multilevel Inheritance
        Sparrow sparrow = new Sparrow();
        sparrow.eat(); // Method from Animal
        sparrow.fly(); // Method from Bird
        sparrow.chirp(); // Method from Sparrow

        // Hierarchical Inheritance
        Car car = new Car();
        car.start(); // Method from Vehicle
        car.drive(); // Method from Car

        Bike bike = new Bike();
        bike.start(); // Method from Vehicle
        bike.ride(); // Method from Bike

        // Multiple Inheritance using Interfaces
        CarWithFeatures carWithFeatures = new CarWithFeatures();
        carWithFeatures.startEngine(); // Method from Engine
        carWithFeatures.refuel(); // Method from Fuel
    }
}
