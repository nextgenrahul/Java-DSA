package Post32;

import java.util.*;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
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
                result.add(nums[index]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr)); 
    }
}
