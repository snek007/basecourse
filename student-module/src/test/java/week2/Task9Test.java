package week2;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task9Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() throws Exception {

        Task9.main(new String[]{"15"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("1111"));
    }

    @Test
    public void main2Test() throws Exception {

        Task9.main(new String[]{"8"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("1000"));
    }
}
