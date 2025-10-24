package Post1;

public class ReverseNumber {

    public static void main(String[] args) {
        int n1 = 1239999;
        System.out.println("Original Number: " + n1);
        long rev1 = reverseInteger(n1); 
        System.out.println("Reversed Number: " + rev1);
    }
    
    public static long reverseInteger(int n) {
        int originalN = n;
        long rev = 0; 
        if (n == 0) {
            return 0;
        }

        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        while (n != 0) {
            int digit = n % 10;
            
            rev = rev * 10 + digit;
            n /= 10;
            
            if (rev * sign > Integer.MAX_VALUE || rev * sign < Integer.MIN_VALUE) {
                System.err.println("ALERT: Integer Overflow detected for input " + originalN);
                return 0; 
            }
        }
        return rev * sign;
    }
}
