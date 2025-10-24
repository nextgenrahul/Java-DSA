package Post5;

import java.util.Scanner;

public class PrintNameFiveTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        printName(1, n);
        sc.close();
    }

    public static void printName(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Rahul Shakya.");
        printName(i + 1, n);
    }
}
