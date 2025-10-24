package Post2;
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 0, 5};
        System.out.println("Largest Element: " + findLargest(arr));
    }

    static int findLargest(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
