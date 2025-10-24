package Post1;
import java.util.*;

public class Pattern7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            pattern7(n);
        }
    }

    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
