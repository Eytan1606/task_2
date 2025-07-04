
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Map;

public class AppTest {

    // בדיקות לפונקציה isPrime
    @Test
    void testIsPrimeWithPrimeNumber() {
        assertTrue(App.isPrime(7));
    }

    @Test
    void testIsPrimeWithNonPrimeNumber() {
        assertFalse(App.isPrime(10));
    }

    @Test
    void testIsPrimeWithNumberLessThanTwo() {
        assertFalse(App.isPrime(1));
    }

    @Test
    void testIsPrimeWithTwo() {
        assertTrue(App.isPrime(2));
    }

    @Test
    void testIsPrimeWithLargePrime() {
        assertTrue(App.isPrime(29));
    }

    // בדיקות לפונקציה charFrequency
    @Test
    void testCharFrequencyWithSimpleString() {
        Map<Character, Integer> result = App.charFrequency("hello");
        assertEquals(1, result.get('h'));
        assertEquals(1, result.get('e'));
        assertEquals(2, result.get('l'));
        assertEquals(1, result.get('o'));
    }

    @Test
    void testCharFrequencyWithEmptyString() {
        Map<Character, Integer> result = App.charFrequency("");
        assertTrue(result.isEmpty());
    }

    @Test
    void testCharFrequencyWithSpaces() {
        Map<Character, Integer> result = App.charFrequency("a a");
        assertEquals(2, result.get('a'));
        assertEquals(1, result.get(' '));
    }

    // בדיקות לפונקציה average
    @Test
    void testAverageWithPositiveNumbers() {
        int[] arr = {2, 4, 6};
        assertEquals(4.0, App.average(arr));
    }

    @Test
    void testAverageWithNegativeNumbers() {
        int[] arr = {-5, -10, -15};
        assertEquals(-10.0, App.average(arr));
    }

    @Test
    void testAverageWithMixedNumbers() {
        int[] arr = {-2, 0, 2};
        assertEquals(0.0, App.average(arr));
    }

    @Test
    void testAverageWithEmptyArray() {
        int[] arr = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            App.average(arr);
        });
        assertEquals("Empty array", exception.getMessage());
    }
}
