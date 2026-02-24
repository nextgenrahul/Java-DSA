package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Reference type is Vehicle, but actual objects are different.

        Vehicle v1 = new ElectricCar("Tesla"); // Upcasting
        Vehicle v2 = new SportsCar("Porsche");
        Vehicle v3 = new Vehicle("Generic"); // Plain superclass

        // Same method calls → different behaviors (runtime polymorphism)
        v1.start(); // Tesla electric car starting silently...
        v1.accelerate(); // Tesla accelerating instantly...

        v2.start(); // Porsche vehicle starting with normal...
        v2.accelerate(); // Porsche roaring with turbo boost!...

        v3.accelerate(); // Generic accelerating normally.

        Vehicle[] vehicles = { v1, v2, v3 };

        for (Vehicle v : vehicles) {
            v.accelerate();
            v.stop();
            System.out.println("---");

        }

    }

}
