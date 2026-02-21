package Practice.OldPractice;
import java.util.ArrayList;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // ArrayList<String> arrs = new ArrayList<String>();
        // ArrayList<Boolean> arrb = new ArrayList<Boolean>();
        arr.add(1);
        arr.add(32);
        arr.add(3232);
        System.out.println(arr);

        for (int i : arr) {
            System.out.println(i);
        }
        String str = "rahul";
        System.out.println(str.charAt(2));
    }
}
