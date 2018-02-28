package week2;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task6Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() throws Exception {

        Task6.main(new String[]{"2", "4", "0", "8", "1", "9", "9", "2"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("{1, 9, 9, 2}"));
    }

    @Test
    public void main2Test() throws Exception {

        Task6.main(new String[]{"2", "4", "0", "8", "-8", "1", "9", "9", "2"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("{1, 9, 9, 2}"));
    }

    @Test
    public void main3Test() throws Exception {

        Task6.main(new String[]{"2", "4", "7", "8", "1", "9", "9", "2"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("{2, 4, 7, 8, 1, 9, 9, 2}"));
    }

    @Test
    public void nullTest() throws Exception {

        Task6.main(null);

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("null"));
    }

    @Test
    public void emptyTest() throws Exception {

        Task6.main(new String[]{});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("{}"));
    }
}
