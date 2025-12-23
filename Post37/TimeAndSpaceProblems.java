package Post37;

import java.util.Arrays;

public class TimeAndSpaceProblems {

    // Problem 1 = Time Complexity : O(1) , Space complexity : O(1)

    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 4, 5 };
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // sum = sum + arr[i];
    // }
    // System.out.println(sum);
    // }

    // Problem 2 = Time complexity : O(n), Space Complexity : O(1)

    // public static void main(String[] args) {
    // int n = 10;
    // for (int i = 0; i < n; i++) {
    // if (i % 2 == 0) {
    // System.out.println(i);
    // }
    // }
    // }

    // Problem 3 = Time Compexity : O(n*n), Space Complexity : O(1)

    // public static void main(String[] args) {
    // int l = 22;
    // for (int i = 0; i < l; i++) {
    // for (int j = 0; j < l; j++) {
    // System.out.println(i);
    // }
    // }
    // }

    // Problem 4 = Time Compexity : O(log n), Space Complexity : O(log n)

    // public static void main(String[] args) {
    // String val = intToStr(123);
    // if (val instanceof String) {
    // System.out.println("Value in String : " + val);
    // }
    // }

    // static String intToStr(int num) {
    // if (num == 0)
    // return "0";
    // String digits = "0123456789";
    // StringBuilder sb = new StringBuilder();
    // while (num > 0) {
    // sb.append(digits.charAt(num % 10));
    // num /= 10;
    // }
    // return sb.reverse().toString();
    // }

    // Problem 5 = Time Compexity : O(n log n), Space Complexity : O(1)
    // public static void main(String[] args) {
    // int n = 10;
    // int i, j, k = 0;
    // for (i = n / 2; i < n; i++) {
    // for (j = 2; j < n; j = j * 2) {
    // k = k + n / 2;
    // System.out.println(j);
    // }
    // }
    // }

    // Problem 6 = Time Compexity : O(n*n), Space Complexity : O(1)
    // public static void main(String[] args) {
    // int n = 10;
    // int i, j = 0;
    // for (i = 0; i < n; i++) {
    // for (j = i + 1; j < n; j++) {
    // System.out.println(i + " : " + j);
    // }
    // }
    // }

    // // Problem 6 = Time Compexity : O(n*n), Space Complexity : O(1)
    // public static void main(String[] args) {
    // int[] a = {1, 2,3, 4, 5};
    // int[] b = {5, 4, 3, 2, 1};
    // int i, j = 0;
    // for (i = 0; i < a.length; i++) {
    // for (j = i + 1; j < b.length; j++) {
    // for(int d = 0; d < 100; d++){
    // System.out.println(i + j);
    // }
    // }
    // }
    // }

    // Problem 6 = Time Compexity : O(n*n), Space Complexity : O(1)

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        int other;
        int temp;

        for (int i = 0; i < a.length / 2; i++) {
            other = a.length - i - 1;

            temp = a[i];
            a[i] = a[other];
            a[other] = temp;
        }

        System.out.println(Arrays.toString(a));
    }

}
