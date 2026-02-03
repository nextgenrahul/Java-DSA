package Post42.AbstractDemo;

public class Main {
    public static void main(String[] args){
        Son son = new Son(23);
        son.career();

        Parent daughter = new Daughter(22);
        daughter.career();
        // Parent parent = new Parent(23); // We can not create a object of abstract class
        Parent.hello();
    }
}
