package Practice.Oops;

public class Car { // Class keyword + name (convention : PascalCase)

    // Fields (Properties/State)
    String brand;
    String model;
    int year;
    double price;
    boolean isElectric;
    double mileage;
    boolean isRunning;

    // Special method to initialize objects called constructor
    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
        mileage = 0.0;
        isRunning = false;
    }

    // Methods / Behavior

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(model + " started.");
        } else {
            System.out.println(model + " is already running.");
        }
    }

    public void drive(double km) {
        if (isRunning) {
            mileage += km;
            System.out.println("Drove " + km + " km. Total mileage: " + mileage);
        } else {
            System.out.println("Start the car first!");
        }
    }

    // Method (Behavior)
    public void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Running? " + isRunning);
        System.out.println("-------------------");
    }

  

}
