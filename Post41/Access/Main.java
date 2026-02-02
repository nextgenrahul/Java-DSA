package Post41.Access;

// import java.util.ArrayList;
// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "rahul");
        // System.out.println(Arrays.toString(obj.arr));
        // Need to do few thing
        // 1. Access the data members
        // 2. Modify the data members
        // ArrayList<Integer> list = new ArrayList<>();
        obj.setName("Khushal");
        System.out.println(obj.getName());

    }
}
