package Post39;

public class FinalKeyword3 {
    public static void main(String[] args) {
        final int MAX_VALUE = 100; // Always initialize final variable during declaration
        // MAX_VALUE = 200; // This will cause a compile-time error

        System.out.println("The maximum value is: " + MAX_VALUE);

        final A obj1 = new A("Object One");
        A obj2 = new A("Object Two");
        System.out.println("obj1 data: " + obj1.data);
        System.out.println("obj2 data: " + obj2.data);
        // obj1.data = 60; // This will cause a compile-time error
        //  obj1 = new A("Object Three"); // Reassigning reference is allowed


    }
}

class A{
    final int data = 50;
    String name;
    public A(String name){
        this.name = name;
    }

}