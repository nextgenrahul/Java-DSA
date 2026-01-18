package Post40.Singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton obj = new Singleton();
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        // This is Singleton approach 

        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
// They all are share the same hash value 
// in Post40.Singleton.Main 
// Post40.Singleton.Singleton@15db9742
// Post40.Singleton.Singleton@15db9742
// Post40.Singleton.Singleton@15db9742

    }
}
