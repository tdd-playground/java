package tdd.fibonacci;

public class FibonacciOptimum {

    public static int fib(int n) {
        int result[] = {0, 1};
        if (n < 2) {
            return result[n];
        }

        int fibNMinusOne = 1;
        int fibNMinusTwo = 0;
        int fibN = 0;
        for (int i = 2; i <= n; ++i) {
            fibN = fibNMinusOne + fibNMinusTwo;

            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }

        return fibN;
    }
}


/* *** In Javascript ***
        var n = 12;
        var result = [0, 1];
        if (n < 2) {
            console.log(result[n]);
        }

        var fibNMinusOne = 1;
        var fibNMinusTwo = 0;
        var fibN = 0;
        for (var i = 2; i <= n; ++i) {
            fibN = fibNMinusOne + fibNMinusTwo;

            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }

        console.log(fibN);
 */