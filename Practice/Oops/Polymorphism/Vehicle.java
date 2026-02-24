package Polymorphism;

public class Vehicle {
    protected String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public void start() {
        System.out.println(brand + " vehicle starting with normal ignition...");
    }
    
    public void accelerate() {
        System.out.println(brand + " accelerating normally.");
    }
    
    public void stop() {
        System.out.println(brand + " stopping with regular brakes.");
    }
}
