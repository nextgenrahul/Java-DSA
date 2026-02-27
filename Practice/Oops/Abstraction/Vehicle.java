package Abstraction;

// Partial abstraction via Abstract Class
public abstract class Vehicle {
    protected String brand;
    protected int year;
    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    // Concrete method (shared implementation)
    public void startEngine() {
        System.out.println(brand + " engine starting...");
    }
    
    // Abstract method (must be implemented by subclasses)
    public abstract void stop();
    
    // Abstract method for polymorphism
    public abstract void displayInfo();
}