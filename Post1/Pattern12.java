package Post1;
import java.util.*;

public class Pattern12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            pattern12(n);
        }
    }

    static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j % 2 == 0) ? "0" : "1");
            }
            System.out.println();
        }
    }
}
