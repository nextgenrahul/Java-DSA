package Post25;

import java.util.*;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                result.add(index + 1);
            }
        }
        return result;
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("Original List Guys : " + Arrays.toString(nums1));
        System.out.println(findDisappearedNumbers(nums1));
        System.out.println("------------");
        int[] nums2 = { 1, 1 };
        System.out.println("Original List Guys : " + Arrays.toString(nums2));
        System.out.println(findDisappearedNumbers(nums2));
    }
}
