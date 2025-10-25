package Post6;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int n) {
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;
        return fib(n - 1) + fib(n - 2);
    }
}
