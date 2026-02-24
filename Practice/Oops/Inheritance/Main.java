package Inheritance;

public class Main {
    public static void main(String[] args){
        Vehicle generic = new Vehicle("Genric", 2026);
        generic.start();
        generic.accelerate(30);
        generic.displayInfo();



        System.out.println("\n--- Car ---\n");

        Car myCar = new Car("Toyota", 2023, 4, "Hybrid");
        myCar.start();
        myCar.accelerate(60);
        myCar.honk();
        myCar.displayInfo();

        System.out.println("\n--- SportsCar ---\n");
        
        SportsCar ferrari = new SportsCar("Ferrari", 2025, 2, true);
        ferrari.start();
        ferrari.accelerate(100);
        ferrari.drift();
        ferrari.displayInfo();
    }
}
