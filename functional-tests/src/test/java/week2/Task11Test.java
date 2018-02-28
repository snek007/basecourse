package week2;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task11Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() throws Exception {

        Task11.main(new String[]{"0"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("1"));
    }

    @Test
    public void main2Test() throws Exception {

        Task11.main(new String[]{"5"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("120"));
    }

    @Test
    public void main3Test() throws Exception {

        Task11.main(new String[]{"-9"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Wrong number"));
    }
}
