

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class AppTest {
// tests for factorial func
    @Test
    public void testFactorialZero() {
        assertEquals(1, MathUtils.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, MathUtils.factorial(1));
    }

    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(120, MathUtils.factorial(5));
        assertEquals(3628800, MathUtils.factorial(10));
    }

    @Test
    public void testFactorialLargeNumber() {
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    @Test
    public void testFactorialNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-1));
    }

    // tests for isPalindrome func

    @Test
    public void testPalindromeSimple() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("racecar"));
    }

    @Test
    public void testPalindromeWithSpacesAndCases() {
        assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama"));
        assertTrue(StringUtils.isPalindrome("Was it a car or a cat I saw"));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome("openai"));
    }

    @Test
    public void testPalindromeWithPunctuation() {
        assertTrue(StringUtils.isPalindrome("No 'x' in Nixon"));
        assertTrue(StringUtils.isPalindrome("Able was I, ere I saw Elba."));
    }

    @Test
    public void testEmptyAndNullStrings() {
        assertTrue(StringUtils.isPalindrome("")); // empty string is considered palindrome
        assertFalse(StringUtils.isPalindrome(null)); // null is not
    }

    // tests for fibonacciUpTo func

    @Test
    public void testFibonacciUpToZero() {
        List<Integer> expected = List.of(0);
        assertEquals(expected, MathUtils.generateFibonacciUpTo(0));
    }

    @Test
    public void testFibonacciUpToOne() {
        List<Integer> expected = List.of(0, 1, 1);
        assertEquals(expected, MathUtils.generateFibonacciUpTo(1));
    }

    @Test
    public void testFibonacciUpToTen() {
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5, 8);
        assertEquals(expected, MathUtils.generateFibonacciUpTo(10));
    }

    @Test
    public void testFibonacciUpToNegative() {
        List<Integer> expected = List.of();
        assertEquals(expected, MathUtils.generateFibonacciUpTo(-5));
    }

    @Test
    public void testFibonacciUpToLargeLimit() {
        List<Integer> result = MathUtils.generateFibonacciUpTo(1000);
        assertTrue(result.get(result.size() - 1) <= 1000);
        assertTrue(result.get(result.size() - 2) <= 1000);
    }


}





