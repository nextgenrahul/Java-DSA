package Post33;

public class SmallestMissingEven {
    public static int firstMissingPositiveEven(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int val = nums[i];
            if (val > 0 && val % 2 == 0) {
                int correctIndex = (val / 2) - 1;
                if (correctIndex >= 0 && correctIndex < n && nums[i] != nums[correctIndex]) {
                    int temp = nums[i];
                    nums[i] = nums[correctIndex];
                    nums[correctIndex] = temp;
                    continue;
                }
            }
            i++;
        }

        // Find missing even number
        for (int index = 0; index < n; index++) {
            int expected = (index + 1) * 2;
            if (nums[index] != expected) {
                return expected;
            }
        }
        return (n + 1) * 2;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 2, 1, 8};
        System.out.println(firstMissingPositiveEven(arr1));

        int[] arr2 = {2, 6, 4, 10};
        System.out.println(firstMissingPositiveEven(arr2)); 
    }
}
