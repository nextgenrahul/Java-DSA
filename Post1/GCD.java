package Post1;

public class GCD {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        System.out.println("GCD of " + a + " and " + b + " = " + findGCD(a, b));
    }

    public static int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
