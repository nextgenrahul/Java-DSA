package Post2;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(3);
        arr.add(33);
        arr.add(393);
        arr.add(39903);
        arr.add(3990893);
        System.out.println(arr.contains(13));
    }
}
