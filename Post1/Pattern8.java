package Post1;
import java.util.*;

public class Pattern8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rows: ");
            int n = sc.nextInt();
            System.out.print("Enter columns: ");
            int m = sc.nextInt();
            pattern8(n, m);
        }
    }

    static void pattern8(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
