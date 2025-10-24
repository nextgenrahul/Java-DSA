package Post1;
import java.util.*;

public class Pattern17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            pattern17(n);
        }
    }

    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            for (char j = 'A'; j <= 'A' + i; j++) System.out.print(j);
            for (char j = (char)('A' + i - 1); j >= 'A'; j--) System.out.print(j);
            System.out.println();
        }
    }
}
    