package Polymorphism;

public class ElectricCar extends Vehicle {
    public ElectricCar(String brand) {
        super(brand);
    }
    
    @Override
    public void start() {
        System.out.println(brand + " electric car starting silently (no engine sound!)");
    }
    
    @Override
    public void accelerate() {
        System.out.println(brand + " accelerating instantly with electric torque! 🚀");
    }
    
    public void charge() {  
        System.out.println("Charging " + brand + " battery...");
    }
}
