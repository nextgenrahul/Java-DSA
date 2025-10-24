package Post2;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {1, 3, 2, 4, 5};

        System.out.println("arr1 Sorted? " + isSorted(arr1));
        System.out.println("arr2 Sorted? " + isSorted(arr2));
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
