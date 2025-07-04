
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class AppTest {

    // בדיקות לפונקציה mostCommonWord
    @Test
    void testMostCommonWord() {
        String text = "Hello world hello world hello test";
        String result = App.mostCommonWord(text);
        assertEquals("hello", result);
    }

    @Test
    void testMostCommonWordWithSingleWord() {
        String text = "Unique";
        String result = App.mostCommonWord(text);
        assertEquals("unique", result);
    }

    @Test
    void testMostCommonWordWithEmptyString() {
        String text = "";
        String result = App.mostCommonWord(text);
        assertEquals("", result); // צריך לוודא איך הפונקציה שלך מתנהגת כאן
    }

    // בדיקות לפונקציה filterEvens
    @Test
    void testFilterEvensWithMixedNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = App.filterEvens(list);
        assertEquals(Arrays.asList(2, 4, 6), result);
    }

    @Test
    void testFilterEvensWithNoEvens() {
        List<Integer> list = Arrays.asList(1, 3, 5);
        List<Integer> result = App.filterEvens(list);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilterEvensWithEmptyList() {
        List<Integer> result = App.filterEvens(Collections.emptyList());
        assertTrue(result.isEmpty());
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
