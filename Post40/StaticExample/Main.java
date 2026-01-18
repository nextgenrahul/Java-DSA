package Post40.StaticExample;

public class Main {
    // whenever you accessing static variables, modifying static variable , declaring static variable please don't do it via the reference variable and Static variable are not dependent on object
    public static void main(String[] args) {
        Human kunal = new Human(23, "Kunal", 10000, false);
        Human rahul = new Human(22, "Rahul ", 15000, true);
        System.out.println(Human.population);
        // greeting(); // it gives error bcz you cannot access non-static function in static function that is why it show and Cannot make a static reference to the non-static method greeting() from the type MainJava(603979977)
        // We know that something which is not static , belongs to an object bcz this greeting function is going have any instance and static method is related to class not an object

        // fun(); // This function is work bcz its doesn't not depend on obj;

    }

    // this is not dependent on object
    // static void fun(){
        // greeting();
    // Main obj = new Main();
    // obj.greeting();

    //     System.out.println("Hello fun");
    // }

    // You cannot access not static stuff without referencing their instance in a static context
//     void greeting(){
//     // fun()// but you can call static fn inside the non-static fn bcz its not limited it will expand time by time
//         System.out.println("Hello Rahul");
//     }
}
