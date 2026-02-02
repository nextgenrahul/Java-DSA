package Post41.Polymorphism;

public class Circle extends Shapes {
    // this will run when object of circle is created
    @Override // This is called annotation
    void area(){
        System.out.println("Area is pie * r * r.");
    }
}
