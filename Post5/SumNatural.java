package Post5;

public class SumNatural {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum: " + sum(n));
    }

    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
}
