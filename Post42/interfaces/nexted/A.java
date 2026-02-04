package Post42.interfaces.nexted;

public class A {
    // Nested interface 
    public interface NextedInterface {
        boolean isOdd(int num);
    }
}


class B implements A.NextedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }

    
}


class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(34));
    }
}