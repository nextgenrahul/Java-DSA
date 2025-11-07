package Post18;

public interface CellingArr {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 8, 9, 10, 12 };
        System.out.println(ceilingArray(arr, 2));
    }

    static int ceilingArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
        return (start < arr.length) ? arr[start] : -1;
    }
}
