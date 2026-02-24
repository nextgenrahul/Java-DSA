package Inheritance;
// This class gonaa make Superclass

public class Vehicle {
    protected String manufacturer;
    protected int year;
    protected double speed;

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.speed = 0.0;
    }

    public void start() {
        System.out.println(manufacturer + " vehicle starting...");
    }

    public void accelerate(double increment) {
        this.speed += increment;
        System.out.println("Accelerating... Current speed: " + speed + " km/h");
    }

    public void displayInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Current speed: " + speed + " km/h");
    }

}


