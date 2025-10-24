package Post4;

import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPrime(n))
            System.out.println(n + " is a Prime Number.");
        else
            System.out.println(n + " is NOT a Prime Number.");
        sc.close();
    }
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false; 
        if (n == 2 || n == 3)
            return true; 
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true; 
    }
}

