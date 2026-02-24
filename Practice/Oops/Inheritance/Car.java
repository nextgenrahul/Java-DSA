package Inheritance;

public class Car extends Vehicle {
    private int numDoors;
    private String fuelType;

    public Car(String manufacturer, int year, int numDoors, String fuelType) {
        super(manufacturer, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    // Overriding (specializing) inherited method
    @Override
    public void accelerate(double increment) {
        super.accelerate(increment);
        System.out.println("Car-specific: Playing cool engine sound! Vroom!");
    }

    // New method specific to Car
    public void honk() {
        System.out.println("Beep beep! " + manufacturer + " car honking.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();                
        System.out.println("Doors: " + numDoors);
        System.out.println("Fuel: " + fuelType);
        System.out.println("-------------------");
    }


    




}
