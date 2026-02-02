package Post41.Polymorphism;

import Post41.Access.A;

public class NotSubClass extends A {
    public NotSubClass(int num , String name){
        super(10, "rahul");
    }

    public static void main(String[] args) {
        NotSubClass obj = new NotSubClass(43, "Super Man");
        System.out.println(obj.num);
    }
}
