package Post43.Cloneing;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Human rahul = new Human(34, "Rahul");

        // Clone using clone()
        Human twin = (Human) rahul.clone();

        // Modify clone
        twin.age = 50;
        twin.arr[0] = 99;

        System.out.println("Original: " + rahul);
        System.out.println("Clone   : " + twin);

        System.out.println("\nUsing Copy Constructor:");

        Human copy = new Human(rahul);
        copy.arr[1] = 88;

        System.out.println("Original: " + rahul);
        System.out.println("Copy    : " + copy);
    }
}
