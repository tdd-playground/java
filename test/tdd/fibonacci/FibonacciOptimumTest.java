package tdd.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciOptimumTest {

    @Test
    public void testForFibonacci0(){
        assertEquals(0, FibonacciOptimum.fib(0));
    }

    @Test
    public void testForFibonacci1(){
        assertEquals(1, FibonacciOptimum.fib(1));
    }

    @Test
    public void testForFibonacci2(){
        assertEquals(1, FibonacciOptimum.fib(2));
    }

    @Test
    public void testForFibonacci3(){
        assertEquals(2, FibonacciOptimum.fib(3));
    }

    @Test
    public void testForFibonacci4(){
        assertEquals(3, FibonacciOptimum.fib(4));
    }

    @Test
    public void testForFibonacci5(){
        assertEquals(5, FibonacciOptimum.fib(5));
    }

    @Test
    public void testForFibonacci11(){
        assertEquals(89, FibonacciOptimum.fib(11));
    }

    @Test
    public void testForFibonacci12(){
        assertEquals(144, FibonacciOptimum.fib(12));
    }
}
