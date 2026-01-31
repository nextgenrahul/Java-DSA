package Post41.Polymorphism;

public class Number {
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Number obj = new Number();
        obj.sum(2, 3);
        obj.sum(2, 3, 7);
        // obj.sum(4, 5, 6, 7, 8);

    }

}
