package Post41.Polymorphism;

import Post41.Access.A;

public class Main {
    public static void main(String[] args) {
        // Shapes shape = new Shapes();
        // Shapes circle = new Circle(); // This " new Shapes() " tell us that which method be called depends on whose object is this and the Shapes this is known as upcasting
        // Square square = new Square(); 
        // circle.area();
        A obj = new A(10, "sunil");
        // System.out.println(obj.num); // We cannot use this variable outside the package
        System.out.println(obj.getName());
    }
}
