package tdd.fizzbuzz;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”."
 */

public class FizzBuzzTest {

    @Test
    public void testIsMultipleOf3(){
        assertEquals(true, FizzBuzz.isMultiple(3, 3));
        assertEquals(false, FizzBuzz.isMultiple(4, 3));
        assertEquals(true, FizzBuzz.isMultiple(21, 3));
    }

    @Test
    public void testIsMultipleOf5(){
        assertEquals(true, FizzBuzz.isMultiple(5, 5));
        assertEquals(false, FizzBuzz.isMultiple(4, 5));
        assertEquals(true, FizzBuzz.isMultiple(20, 5));
    }

    @Test
    public void testIsMultipleOf15(){
        assertEquals(false, FizzBuzz.isMultiple(5, 15));
        assertEquals(true, FizzBuzz.isMultiple(15, 15));
        assertEquals(true, FizzBuzz.isMultiple(30, 15));
        assertEquals(false, FizzBuzz.isMultiple(35, 15));
    }
}