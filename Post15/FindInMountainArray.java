package Post15;

public class FindInMountainArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2};
        int target = 4;
        System.out.println(findInMountainArray(arr, target));
    }
    static int findInMountainArray(int[] arr, int target){
        int peak = searchPeak(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;   
        }
        return orderAgnostic(arr, target, peak + 1, arr.length - 1);
    }
    static int searchPeak(int[] nums) {
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
    static int orderAgnostic(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
