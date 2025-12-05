package Post36;

import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int target = 3;

        List<Integer> current = new ArrayList<>();
        subsetSum(arr, 0, target, current, 0);
    }

    static void subsetSum(int[] arr, int index, int target,
            List<Integer> current, int currentSum) {

        if (index == arr.length) {
            if (currentSum == target) {
                System.out.println(current);
            }
            return;
        }
        current.add(arr[index]);
        subsetSum(arr, index + 1, target, current, currentSum + arr[index]);
        current.remove(current.size() - 1);
        subsetSum(arr, index + 1, target, current, currentSum);
    }
}
