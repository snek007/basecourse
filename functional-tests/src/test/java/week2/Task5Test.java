package week2;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task5Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() throws Exception {

        Task5.main(new String[]{"2", "4", "0", "8", "1", "9", "9", "2"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("{2, 4, 9, 8, 1, 0, 9, 2}"));
    }

    @Test
    public void nullTest() throws Exception {

        Task5.main(null);

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("null"));
    }

    @Test
    public void emptyTest() throws Exception {

        Task5.main(new String[]{});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("{}"));
    }
}
