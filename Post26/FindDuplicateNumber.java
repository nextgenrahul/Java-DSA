package Post26;

import java.util.Arrays;

public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 2, 3};
        System.out.println("Duplicate: " + findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // After sorting, find duplicate
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return -1; // not found
    }
}
