package Post42.AbstractDemo;

public class Son extends Parent {
    public Son(int age){
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be a Billionaire");
        
    }

    @Override
    void partner() {
        System.out.println("I Love Kushina Uzumaki. She is 22");        
    }
    
}
