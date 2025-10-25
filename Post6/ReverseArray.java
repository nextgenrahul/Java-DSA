package Post6;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0, n - 1);
        System.out.println("Reversed array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }

    static void reverse(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr, left + 1, right - 1);
    }
}
