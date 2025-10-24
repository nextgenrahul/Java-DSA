package Post1;
import java.util.*;

public class Pattern19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            pattern19(n);
        }
    }

    static void pattern19(int n) {
        for (int i = 0; i < n; i++) {
            String star = "*".repeat(n - i);
            String space = " ".repeat(2 * i);
            System.out.println(star + space + star);
        }
        for (int i = n - 1; i >= 0; i--) {
            String star = "*".repeat(n - i);
            String space = " ".repeat(2 * i);
            System.out.println(star + space + star);
        }
    }
}
