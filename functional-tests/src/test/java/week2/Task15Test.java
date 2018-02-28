package week2;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task15Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() throws Exception {

        Task15.main(new String[]{"2", "4", "0", "8", "1", "9", "9", "2"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("{9, 2, 4, 0, 8, 1, 9}"));
    }

    @Test
    public void main2Test() throws Exception {

        Task6.main(new String[]{"4", "0", "8", "-8", "1", "9", "9", "2"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("{1, 9, 9, 2, 0, 8, -8}"));
    }
}
