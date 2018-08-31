package tdd.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeAltTest {

    @Test
    public void testIsPalindromeA() {
        assertEquals(false, PalindromeAlt.isPalindrome("Hello".toCharArray()));
    }

    @Test
    public void testIsPalindromeB() { // Won't account for casing since looking at char array
        assertEquals(false, PalindromeAlt.isPalindrome("kayak".toCharArray()));
    }

    @Test
    public void testIsPalindromeC() {
        assertEquals(true, PalindromeAlt.isPalindrome("Kayak".toCharArray()));
    }
}
