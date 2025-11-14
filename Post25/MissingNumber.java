package Post25;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 0, 4};
        cyclicSort(arr);
        System.out.println("Missing Number : " + findMissingNumber(arr));
    }

    static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        return findMissingNumber(arr);
    }

    static int findMissingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length; 
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
