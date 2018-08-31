package tdd.fibonacci;

public class FibonacciRecursive {

    public static int fib(int n) { // Would require long for large numbers in the series

        if(n <= 0)
            return 0;

        if(n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }
}
