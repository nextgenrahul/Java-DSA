package Post15;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 2, 3, 4, 1, 2, 3, 4};
        System.out.println(searchPeak(arr));
    }

    static int searchPeak(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
