package Post3;
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayUsingBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array (using Arrays.sort()):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}

