package tdd.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Determine if a string is a palindrome (text that is spelled the same when reversed).
 */
public class PalindromeTest {

    @Test
    public void testIsPalindromeA() {
        assertEquals(false, Palindrome.isPalindrome("Hello"));
    }

    @Test
    public void testIsPalindromeB() {
        assertEquals(true, Palindrome.isPalindrome("kayak"));
    }

    @Test
    public void testIsPalindromeC() {
        assertEquals(true, Palindrome.isPalindrome("Kayak"));
    }

    @Test
    public void testReverseString(){
        assertEquals("olleH", Palindrome.reverseString("Hello"));
    }
}
