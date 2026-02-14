package Post44.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(74);
        list2.add(84);
        list2.add(94);

        // System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(2);
        vector.add(56);
        vector.add(92);
        vector.add(22);

        System.out.println(vector);
    }
}
