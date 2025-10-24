package Post1;

public class CountDigit {
    public static int countDigits(int n) {
        if (n == 0) return 1;
        n = Math.abs(n);
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 2323;
        int digitCount = countDigits(n); 
        System.out.println("The number of digits in " + n + " is: " + digitCount);
    }
}