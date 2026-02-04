package Post42.interfaces.extendDemo2;

public interface A {

    // Static interface method should always have a body 

    // Call why the interface name 
    static void greeting(){
        System.out.println("Hey i am static method");
    }



    default void fun(){
        System.out.println("I am in A");
    };
    
}

// Static method cannot be inherited 