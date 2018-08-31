package tdd.fibonacci;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Write a method fib() that takes an integer n and returns the nth Fibonacci number
 * Fibonacci series is characterized by the fact that every number after the first two is the sum of the two preceding one
 * Fn = Fn - 1 + Fn - 2
 * With Seed values F0 = 0, F1 = 1, F2 = 2
 * 0,1,1,2,3,5,8,13,21,34,55,89,144,...
 */
public class FibonacciRecursiveTest {

    @Test
    public void testForFibonacci0(){
        assertEquals(0, FibonacciRecursive.fib(0));
    }

    @Test
    public void testForFibonacci1(){
        assertEquals(1, FibonacciRecursive.fib(1));
    }

    @Test
    public void testForFibonacci2(){
        assertEquals(1, FibonacciRecursive.fib(2));
    }

    @Test
    public void testForFibonacci3(){
        assertEquals(2, FibonacciRecursive.fib(3));
    }

    @Test
    public void testForFibonacci4(){
        assertEquals(3, FibonacciRecursive.fib(4));
    }

    @Test
    public void testForFibonacci5(){
        assertEquals(5, FibonacciRecursive.fib(5));
    }

    @Test
    public void testForFibonacci11(){
        assertEquals(89, FibonacciRecursive.fib(11));
    }

    @Test
    public void testForFibonacci12(){
        assertEquals(144, FibonacciRecursive.fib(12));
    }
}
