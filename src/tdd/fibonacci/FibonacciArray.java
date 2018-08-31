package tdd.fibonacci;

import java.util.Arrays;

public class FibonacciArray {

    public static final int[] FIBONACCI_SEED_DATA = { 0, 1, 1 };

    public static int fib(int n) {

        int[] newArray;

        if (n <= 2) {
            return FIBONACCI_SEED_DATA[n];
        } else {
            newArray = Arrays.copyOf(FIBONACCI_SEED_DATA, n + 1); // Probably wouldn't want to use this ...
        }

        for(int index = 3; index <= n; index++) {
            newArray[index] = newArray[index - 1] + newArray[index - 2];
        }

        return newArray[n];
    }
}
