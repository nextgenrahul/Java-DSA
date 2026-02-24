package Inheritance;

public class SportsCar extends Car {
    private boolean hasTurbo;

    public SportsCar(String manufacturer, int year, int numDoors, boolean hasTurbo) {
        super(manufacturer, year, numDoors, "Petrol"); // chain to Car constructor
        this.hasTurbo = hasTurbo;
    }

    // Additional overriding
    @Override
    public void accelerate(double increment) {
        super.accelerate(increment * 1.5); 
        if (hasTurbo) {
            System.out.println("TURBO BOOST ACTIVATED! 🚀");
        }
    }

    public void drift() {
        System.out.println(manufacturer + " SportsCar drifting like a pro!");
    }

}
