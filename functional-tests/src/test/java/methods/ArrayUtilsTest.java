package methods;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;


public class ArrayUtilsTest {

    @Test
    public void generateArr() throws Exception {

        int[] arr = ArrayUtils.generateArray(10);

        Assert.assertThat(arr, notNullValue());
        Assert.assertThat(arr.length, is(10));
    }

    @Test
    public void findMin() throws Exception {

        int min = ArrayUtils.findMin(new int[]{1,2,3,4,-5,23});

        Assert.assertThat(min, is(-5));
    }

}