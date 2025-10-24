package Post1;
import java.util.*;

public class Pattern18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            pattern18(n);
        }
    }

    static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = (char)('A' + n - i - 1); j < 'A' + n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
