package Post14;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(ans(arr, 8));
    }
    static int ans(int[] arr, int target){
        if (arr == null || arr.length == 0) return -1;
        int start = 0;
        int end = 1;
        while (end < arr.length && arr[end] < target) {
            start = end + 1;
            end = Math.min(arr.length - 1, end * 2);
        }
        if (start >= arr.length) return -1;
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; 
    }
}
