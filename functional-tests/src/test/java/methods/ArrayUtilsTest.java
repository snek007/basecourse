package methods;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by serhii on 12.02.18.
 */
public class ArrayUtilsTest {

    @Test
    public void generateArr() throws Exception {

        int[] arr = ArrayUtils.generateArr(10);

        Assert.assertThat(arr, notNullValue());
        Assert.assertThat(arr.length, is(10));
    }

    @Test
    public void findMin() throws Exception {

        int min = ArrayUtils.findMin(new int[]{1,2,3,4,-5,23});

        Assert.assertThat(min, is(-5));
    }

}