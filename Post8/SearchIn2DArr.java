package Post8;

import java.util.Arrays;
public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 43, 3 },
                { 18, 28, 34, 2, 9 },
                { 10, 13, 32 }
        };
        int target = 34;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}

