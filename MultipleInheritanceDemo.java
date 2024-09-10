// First Interface
interface Engine {
    void startEngine();
    void stopEngine();
}

// Second Interface
interface Fuel {
    void refuel();
    void checkFuelLevel();
}

// Class implementing multiple interfaces
class Car implements Engine, Fuel {
    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    @Override
    public void refuel() {
        System.out.println("Car refueled.");
    }

    @Override
    public void checkFuelLevel() {
        System.out.println("Fuel level checked.");
    }

    // Additional method specific to Car
    void drive() {
        System.out.println("Car is driving.");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car();

        // Call methods from Engine interface
        myCar.startEngine();
        myCar.stopEngine();

        // Call methods from Fuel interface
        myCar.refuel();
        myCar.checkFuelLevel();

        // Call additional method specific to Car
        myCar.drive();
    }
}
