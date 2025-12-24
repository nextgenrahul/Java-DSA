package Post37;

import java.util.Arrays;

public class Problem8 {
    /*
     Time Complexity  : O(n)
     Space Complexity : O(1)
    */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length / 2; i++) {
            int other = a.length - i - 1;
            int temp = a[i];
            a[i] = a[other];
            a[other] = temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
