package Post34;

public class KthSwapSelectionSort {
    public static int[] kthSelectionSwap(int[] nums, int k) {
        int n = nums.length;
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swapCount++;
                if (swapCount == k) {
                    return new int[]{nums[i], nums[minIndex]};
                }
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 1};
        int k = 2;
        int[] result = kthSelectionSwap(arr, k);
        System.out.println(result[0] + " " + result[1]); 
    }
}
