package Post42.AbstractDemo;

public class Daughter extends Parent {
    int age;
    public Daughter(int age){
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be a Independent Girl.");
        
    }

    @Override
    void partner() {
        System.out.println("I Love Minato Uzumaki. He is 23.");        
    }
    
}
