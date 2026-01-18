package Post40.StaticExample;

public class Human {
    int age;
    String name;
    float salary;
    boolean married;
    // Static Use for static value that are same for all objects.
    static long population;

    static void message(){
        System.out.println("Hello world");
        // System.out.println(this.age); // This is not work bcz its not part of the class its the part of the obj 
    }
    public Human(int age, String name, float salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
        
    } 

}
