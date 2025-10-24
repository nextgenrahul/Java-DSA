package Post1;
    import java.util.*;

public class Pattern16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            pattern16(n);
        }
    }

    static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = (char)('A' + n - i - 1); j >= 'A'; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
