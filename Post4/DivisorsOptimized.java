package Post4;

import java.util.*;
public class DivisorsOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);          
                if (i != n / i) {
                    divisors.add(n / i);  
                }
            }
        }
        Collections.sort(divisors);
        System.out.println("Divisors of " + n + " are: " + divisors);
        sc.close();
    }
}
