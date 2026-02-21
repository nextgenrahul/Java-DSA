package Practice.Oops;

// Creating and using objects (in another class or main method)
public class Main {
    public static void main(String[] args) {
        // Creating Object
        Car car1 = new Car("Toyota", "Fortuner", 2023);

        Car car2 = new Car("BMW", "X5", 2024);

        // car1.displayDetails();
        // car1.start();
        // car1.drive(45.5);
        // car1.displayDetails();


        // System.out.println("\n--- Different car ---\n");
        
        // car2.displayDetails();
        // car2.start();
        // car2.drive(120.0);
        // car2.displayDetails();

        Car car3 = car1;
        car3.start();
        car1.displayDetails();
    }

}
