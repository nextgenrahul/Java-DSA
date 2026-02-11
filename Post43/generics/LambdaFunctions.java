package Post43.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
        // arr.forEach((item) -> System.out.println(item * 23));
        // Consumer<Integer> fun = (item) -> System.out.println(item * 23);
        // arr.forEach(fun);

    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    int sum(int a, int b) {
        return a + b;

    }
}

interface Operation{
    int operation(int a, int b);
}