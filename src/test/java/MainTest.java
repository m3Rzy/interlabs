import org.junit.*;

import static org.junit.Assert.*;

public class MainTest {

    private int[] nums;

    @Before
    public void setUp() {
        nums = new int[]{};
    }

    /* Проверяет массив, когда пропущено одно число. */
    @Test
    public void isFoundMissingNumber() {
        nums = new int[]{7, 9, 10, 11, 12};
        assertEquals(8, Main.searchMissingNumber(nums));
    }

    /* Проверяет массив без пропущенных чисел. */
    @Test
    public void isNotFoundMissingNumber() {
        nums = new int[]{1, 2, 3, 4, 5};
        assertEquals(-1, Main.searchMissingNumber(nums));
    }

    /* Ищет первое пропущенное число в массиве (несколько пропущенных в последовательности). */
    @Test
    public void isFoundFirstMissingNumberInIncorrectArray() {
        nums = new int[]{1, 7, 3, 4, 10};
        assertEquals(2, Main.searchMissingNumber(nums));
    }

    /* Проверяет пропущенное число в пустом массиве. */
    @Test
    public void isNotFoundMissingNumberInEmptyArray() {
        nums = new int[]{};
        assertEquals(-1, Main.searchMissingNumber(nums));
    }

    /* Проверяет массив с отрицательными значениями на наличие пропущенного числа. */
    @Test
    public void isFoundMissingNumberInArrayWithNegativeNumbers() {
        nums = new int[]{-2, -4, -1, 0, -5};
        assertEquals(-3, Main.searchMissingNumber(nums));
    }
}