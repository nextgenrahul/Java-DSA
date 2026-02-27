package Abstraction;

public class Main {
    public static void main(String[] args) {
        Drivable vehicle = new Car("Honda", 2024, 4);  // Polymorphism + abstraction
        
        vehicle.drive();          // Implemented in Car
        vehicle.honk();           // Overridden default
        // vehicle.startEngine();    // From abstract class (but reference is interface → won't compile unless cast)
        // vehicle.printSafetyTips();
        
        // Better: use concrete type or appropriate supertype
        Vehicle car = new Car("Toyota", 2025, 5);
        car.startEngine();
        car.displayInfo();
        car.stop();
        
        Drivable.printSafetyTips();  // Static call
    }
}