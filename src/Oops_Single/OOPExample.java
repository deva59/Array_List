package Oops_Single;

    // Abstraction - Abstract Class
    abstract class Vehicle {
    private String brand; // Encapsulation - private field

    // Constructor to initialize brand
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Encapsulation - Getter and Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Abstract Method
    public abstract void startEngine();

    // Concrete Method
    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

// Inheritance - Car is a subclass of Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand); // Calling parent constructor
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Polymorphism - Overriding the abstract method
    @Override
    public void startEngine() {
        System.out.println("Car engine is starting...");
    }

    // Polymorphism - Overloading a method
    public void startEngine(String keyType) {
        System.out.println("Car engine is starting with " + keyType + " key...");
    }
}

// Another subclass of Vehicle
class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand, boolean hasSideCar) {
        super(brand); // Calling parent constructor
        this.hasSideCar = hasSideCar;
    }

    public boolean hasSideCar() {
        return hasSideCar;
    }

    public void setSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    // Polymorphism - Overriding the abstract method
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine is starting...");
    }
}

// Main Class
public class OOPExample {
    public static void main(String[] args) {
        // Using Encapsulation - Set and Get data
        Car car = new Car("Toyota", 4);
        car.setBrand("Honda");
        car.displayInfo(); // Encapsulation - Using method to access private data
        car.startEngine(); // Polymorphism - Overridden method
        car.startEngine("smart"); // Polymorphism - Overloaded method

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Harley", true);
        motorcycle.displayInfo();
        motorcycle.startEngine();

        System.out.println();

        // Polymorphism - Using parent class reference
        Vehicle vehicle = new Car("Ford", 2);
        vehicle.displayInfo();
        vehicle.startEngine(); // Dynamic binding at runtime
    }
}
