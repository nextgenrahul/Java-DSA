package Post41.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.3);
        Box box = new Box(box1);
        // System.out.println(box.l + " " + box.w + " " + " " + box.h);
        box.information();
        // System.out.println(box1.l + " " + box1.w + " " + " " + box1.h);

        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
        // System.out.println(box3.h + " " + box3.weight);

        // Box box5 = new BoxWeight(2, 3, 4, 8);
        // System.out.println(box5.weight); //box5 is a reference of type Box pointing
        // to an object of type BoxWeight. In Java, data members are accessed using the
        // reference type, so only members present in Box can be accessed through box5

        // BoxWeight box5 = new Box(2.2, 3.3, 4.4, 34.3); // is invalid because a parent object cannot
        // be referenced by a child class reference.
        // Java prevents this at compile time since the object does not contain the
        // child-specific members (weight).

        // BoxWeight box5 = new Box(2, 3, 4);

        // BoxPrice box = new BoxPrice(5, 8, 200);
        


    }
}
