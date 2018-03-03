package methods;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ArrayUtilsTest extends ConsoleWrapperFixture {

    @Test
    public void generateArrayTest() {

        int size = 10;
        int[] array = ArrayUtils.generateArray(size);

        Assert.assertThat(array, notNullValue());
        Assert.assertThat(array.length, is(size));

        for (int i = 0; i < size; i++) {
            assertEquals(i + 1, array[i]);
        }
    }

    @Test
    public void generateArrayZeroSizeTest() {

        int[] array = ArrayUtils.generateArray(0);

        Assert.assertThat(array, notNullValue());
        Assert.assertThat(array.length, is(0));
    }

    @Test
    public void generateArrayNegativeSizeTest() {

        int[] array = ArrayUtils.generateArray(-7);

        Assert.assertThat(array, nullValue());
    }

    @Test
    public void findMinTest() {

        int min = ArrayUtils.findMin(new int[]{1, 2, 3, 4, -5, 23});

        Assert.assertThat(min, is(-5));
    }

    @Test
    public void findMinNullArrayTest() {

        int min = ArrayUtils.findMin(null);

        Assert.assertThat(min, is(-1));

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("NullPointerException"));

    }

    @Test
    public void findMinEmptyArrayTest() {

        int min = ArrayUtils.findMin(new int[]{});

        Assert.assertThat(min, is(-1));

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("EmptyArrayException"));

    }

    @Test
    public void findMaxTest() {

        int min = ArrayUtils.findMax(new int[]{1, 2, 3, 4, -5, 23});

        Assert.assertThat(min, is(23));
    }

    @Test
    public void findMaxNullArrayTest() {

        int min = ArrayUtils.findMax(null);

        Assert.assertThat(min, is(-1));

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("NullPointerException"));

    }

    @Test
    public void findMaxEmptyArrayTest() {

        int min = ArrayUtils.findMax(new int[]{});

        Assert.assertThat(min, is(-1));

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("EmptyArrayException"));

    }

    @Test
    public void generateRandomArrayTest() {

        int size = 10;
        int min = 5;
        int max = 125;

        int[] array = ArrayUtils.generateRandomArray(size, min, max);

        Assert.assertThat(array, notNullValue());
        Assert.assertThat(array.length, is(size));

        for (int i = 0; i < size; i++) {
            assertTrue(array[i] >= min && array[i] < max);
            assertEquals(i + 1, array[i]);
        }
    }

    @Test
    public void generateRandomArrayZeroSizeTest()  {

        int size = 0;
        int min = 5;
        int max = 125;

        int[] array = ArrayUtils.generateRandomArray(size, min, max);

        Assert.assertThat(array, notNullValue());
        Assert.assertThat(array.length, is(0));
    }

    @Test
    public void generateRandomArrayNegativeSizeTest() {

        int size = -7;
        int min = 5;
        int max = 125;

        int[] array = ArrayUtils.generateRandomArray(size, min, max);

        Assert.assertThat(array, nullValue());
    }

    @Test
    public void generateRandomArrayWrongRangeTest() {

        int size = 10;
        int min = 135;
        int max = 125;

        int[] array = ArrayUtils.generateRandomArray(size, min, max);

        Assert.assertThat(array, nullValue());
    }

    @Test
    public void generateRandomEvenOddArrayTest() {

        int size = 10;
        int min = 5;
        int max = 125;

        int[] array = ArrayUtils.generateRandomEvenOddArray(size, min, max);

        Assert.assertThat(array, notNullValue());
        Assert.assertThat(array.length, is(size));

        for (int i = 0; i < size; i++) {

            assertTrue(array[i] >= min && array[i] < max);

            if(i % 2 == 0) {
                assertTrue(array[i] % 2 == 0);
            } else {
                assertTrue(array[i] % 2 == 1);
            }
        }
    }

    @Test
    public void generateRandomEvenOddArrayZeroSizeTest() {

        int size = 0;
        int min = 5;
        int max = 125;

        int[] array = ArrayUtils.generateRandomEvenOddArray(size, min, max);

        Assert.assertThat(array, notNullValue());
        Assert.assertThat(array.length, is(0));
    }

    @Test
    public void generateRandomEvenOddArrayNegativeSizeTest() {

        int size = -7;
        int min = 5;
        int max = 125;

        int[] array = ArrayUtils.generateRandomEvenOddArray(size, min, max);

        Assert.assertThat(array, nullValue());
    }

    @Test
    public void generateRandomEvenOddArrayWrongRangeTest() {

        int size = 10;
        int min = 135;
        int max = 125;

        int[] array = ArrayUtils.generateRandomEvenOddArray(size, min, max);

        Assert.assertThat(array, nullValue());
    }

    @Test
    public void intArrayToStringTest() {

        String arrayToString = ArrayUtils.arrayToString(new int[]{1, 2, 3, 4, -5, 23});

        assertEquals("{1, 2, 3, 4, -5, 23}", arrayToString);
    }

    @Test
    public void intArrayToStringNullArrayTest() {

        String arrayToString = ArrayUtils.arrayToString((int[])null);

        assertEquals("null", arrayToString);
    }

    @Test
    public void intArrayToStringEmptyArrayTest() {

        String arrayToString = ArrayUtils.arrayToString(new int[]{});

        assertEquals("{}", arrayToString);
    }

    @Test
    public void charArrayToStringTest() {

        String arrayToString = ArrayUtils.arrayToString(new char[]{'A', 'b', 'C', 'd', 'e'});

        assertEquals("{A, b, C, d, e}", arrayToString);
    }

    @Test
    public void charArrayToStringNullArrayTest() {

        String arrayToString = ArrayUtils.arrayToString((char[])null);

        assertEquals("null", arrayToString);
    }

    @Test
    public void charArrayToStringEmptyArrayTest() {

        String arrayToString = ArrayUtils.arrayToString(new char[]{});

        assertEquals("{}", arrayToString);
    }

    @Test
    public void stringArrayToStringTest() {

        String arrayToString = ArrayUtils.arrayToString(new String[]{"Apple", "Monkey", "weather", "home", "Love"});

        assertEquals("{Apple, Monkey, weather, home, Love}", arrayToString);
    }

    @Test
    public void stringArrayToStringNullArrayTest() {

        String arrayToString = ArrayUtils.arrayToString((String[])null);

        assertEquals("null", arrayToString);
    }

    @Test
    public void stringArrayToStringEmptyArrayTest() {

        String arrayToString = ArrayUtils.arrayToString(new String[]{});

        assertEquals("{}", arrayToString);
    }
}