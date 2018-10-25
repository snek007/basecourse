package week2;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task8Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() throws Exception {

        Task8.main(new String[]{"2", "4", "0", "8", "1", "9", "9", "2"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("0"));
    }

    @Test
    public void main2Test() throws Exception {

        Task8.main(new String[]{"5", "4", "25", "5", "15", "9", "5", "2"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("3"));
    }

    @Test
    public void nullTest() throws Exception {

        Task8.main(null);

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("null"));
    }

    @Test
    public void emptyTest() throws Exception {

        Task8.main(new String[]{});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("{}"));
    }
}
