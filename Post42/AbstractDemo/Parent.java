package Post42.AbstractDemo;

public abstract class Parent {
    /// An abstract class is used to define a common structure for subclasses.
    // It cannot be instantiated and may contain abstract methods.
    // These abstract methods force child classes to provide their own
    // implementation,
    // ensuring consistency while allowing flexibility.

    int age;

    // public Parent(int age){
    //     this.age = age;
    // }  We cannot create a constructor of abstract class bcz when you call career then what will be print ... Nothing .. that is why 
    
    static void hello(){
        System.out.println("Hello ..");
    }
    abstract void career();

    abstract void partner();
}
