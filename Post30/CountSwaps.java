package Post30;

public class CountSwaps {
    public static int countBubbleSwaps(int[] arr) {
        int n = arr.length;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 1};
        System.out.println(countBubbleSwaps(arr));
    }
}
