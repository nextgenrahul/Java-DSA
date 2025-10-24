package Post1;
import java.util.*;

public class Pattern11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            pattern11(n);
        }
    }

    static void pattern11(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i <= n) ? i : 2 * n - i;
            for (int j = 1; j <= stars; j++) System.out.print("*");
            System.out.println();
        }
    }
}
