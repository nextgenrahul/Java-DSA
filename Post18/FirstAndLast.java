package Post18;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 8, 9, 10, 12 };
        int[] result = searchRange(arr, 8);
        System.out.println(Arrays.toString(result));

    }

     static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }
    static int search(int[] arr, int target, boolean findStartIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
