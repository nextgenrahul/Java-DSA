package Post1;

public class PalindromeNumber {

    public static void main(String[] args) {
        int n1 = 121;
        int n2 = 12345;
        int n3 = -121;
        int n4 = 0;

        System.out.println(n1 + " → " + (isPalindrome(n1) ? "Palindrome" : "Not Palindrome"));
        System.out.println(n2 + " → " + (isPalindrome(n2) ? "Palindrome" : "Not Palindrome"));
        System.out.println(n3 + " → " + (isPalindrome(n3) ? "Palindrome" : "Not Palindrome"));
        System.out.println(n4 + " → " + (isPalindrome(n4) ? "Palindrome" : "Not Palindrome"));
    }

    /**
     * Checks whether a number is palindrome.
     */
    public static boolean isPalindrome(int n) {
        // Negative numbers are not palindrome.
        if (n < 0) {
            return false;
        }

        int original = n;
        long reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;

            // Overflow safety check
            if (reversed > Integer.MAX_VALUE) {
                return false;
            }
        }

        return original == reversed;
    }
}
