package Post1;
import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            pattern4(n);
        }
    }

    static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}

