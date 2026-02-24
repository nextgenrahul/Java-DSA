package Polymorphism;

public class SportsCar extends Vehicle {
    public SportsCar(String brand) {
        super(brand);
    }
    
    @Override
    public void accelerate() {
        System.out.println(brand + " roaring with turbo boost! VROOOM!");
    }
    
    @Override
    public void stop() {
        System.out.println(brand + " stopping with high-performance brakes.");
    }
}