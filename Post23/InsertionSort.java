package Post23;

import java.util.Arrays;

public class InsertionSort {
    static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = arr[i];
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }   
            arr[j + 1] = key;          
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println(Arrays.toString(sort(arr)));

    }
}
