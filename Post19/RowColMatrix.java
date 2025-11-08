package Post19;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(arr, 29)));
    }
    static int[] search(int[][] martix, int target){
        int r = 0;
        int c = martix.length - 1;
        while (r < martix.length && c >= 0) {
            if(martix[r][c] == target){
                return new int[]{r, c};
            }
            if(martix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
