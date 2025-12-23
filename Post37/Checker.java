package Post37;

public class Checker {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        for (int i = 0; i <= 1000000; i++) {
            System.out.println(i);
        }

        long endTime = System.nanoTime();
        double exactTime = (endTime - startTime) / 1_000_000_000.0;
        System.out.printf("Time taken (seconds): %.6f%n", exactTime);

    }
}
