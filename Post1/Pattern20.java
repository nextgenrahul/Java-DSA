package Post1;
import java.util.*;

public class Pattern20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            pattern20(n);
        }
    }

    static void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            String star = "*".repeat(i);
            String space = " ".repeat((n - i) * 2);
            System.out.println(star + space + star);
        }
        for (int i = n - 1; i > 0; i--) {
            String star = "*".repeat(i);
            String space = " ".repeat((n - i) * 2);
            System.out.println(star + space + star);
        }
    }
}

