package Post8;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = { 32, 434, 54, 222, 33 };
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int output = 0;

        for (int num : nums) {
            if (countDigits(num) % 2 == 0) {
                output++;
            }
        }
        return output;
    }
    static int countDigits(int num) {
        if (num == 0)
            return 1;
        int count = 0;
        while (num > 0) {
            count++;         
            num = num / 10;
        }
        return count;
    }
}
