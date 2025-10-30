package Post10;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 9, 10, 11, 0, 1, 2, 3, 4, 5 };
        System.out.println(search(arr, 7));
    }

    static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;

            }
        }
        return -1;
    }
}
