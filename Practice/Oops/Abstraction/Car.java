package Abstraction;

public class Car extends Vehicle implements Drivable {
    
    private int numDoors;
    
    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }
    
    @Override
    public void drive() {
        System.out.println(brand + " car is driving on road with " + numDoors + " doors.");
    }
    
    @Override
    public void stop() {
        System.out.println(brand + " car stopping with disc brakes.");
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Car: " + brand + " (" + year + "), Doors: " + numDoors);
    }
    
    // Can override default if needed
    @Override
    public void honk() {
        System.out.println(brand + " car honking loudly: HONK HONK!");
    }
}
