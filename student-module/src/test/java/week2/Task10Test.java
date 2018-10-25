package week2;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task10Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() throws Exception {

        Task10.main(new String[]{"1", "0", "0", "0"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("8"));
    }

    @Test
    public void main2Test() throws Exception {

        Task10.main(new String[]{"1", "1", "1", "1"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("15"));
    }
}
