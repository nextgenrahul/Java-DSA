package Post2;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 93, 18, 343 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        // System.out.println(maxRange(arr, 1, 3));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr, int index1, int index2) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (index1 < 0 || index2 >= arr.length || index1 > index2) {
            throw new IllegalArgumentException("Invalid range");
        }

        int max = arr[index1];
        for (int i = index1 + 1; i <= index2; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
