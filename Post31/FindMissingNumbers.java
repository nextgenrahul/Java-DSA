package Post31;

import java.util.*;

public class FindMissingNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
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

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr)); // [5,6]
    }
}
