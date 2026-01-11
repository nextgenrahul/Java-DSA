package Post38;

public class LearnTimeAndSpace {
    /*
     * Time Complexity : O(log n)
     * Space Complexity : O(log n) // recursion stack
     */
    public static void main(String[] args) {
        // int result = power(10);
        // System.out.println("Final Answer: " + result);
        int a = 34;
        String b = "hellO";
        if(a == 34 ^ b =="hello"){
            System.out.println("Hello This is False");
        }
    }

    static int power(int num) {
        if(num == 0){
            return 0;
        }

        // Base case
        if (num == 1) {
            return 1;
        }
        int prev = power(num / 2);
        // System.out.println(prev);
        int curr = prev * 2;

        System.out.println(curr);
        return curr;
    }

    static int mod(int a, int b){
        if(b <= 0){
            return -1;
        }
        int div = a / b;
        return a - div * b;
    }
}
